package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PetDAOImpl implements PetDAO {
    private static final String DBURL = "jdbc:mariadb://localhost:3306/petdb?allowMultiQueries=true";
    private static final String DBUSER = "root";
    private static final String DBPASS = "123456";

    public PetDAOImpl() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void adicionar(Pet p) {
        try {
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            String sql = "INSERT INTO pet (id, nome, raca, peso, nascimento)  " +
                    "VALUES (?, ?, ?, ?, ?)";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getRaca());
            stmt.setDouble(4, p.getPeso());
            stmt.setDate(5, java.sql.Date.valueOf(p.getNascimento()));
            stmt.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pet> pesquisarPorNome(String nome) {
        List<Pet> encontrados = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            String sql = "SELECT * FROM pet WHERE nome like '%" + nome + "%'";
            System.out.println(sql);

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {

                Pet p = new Pet();
                p.setId( rs.getLong("id") );
                p.setNome( rs.getString("nome") );
                p.setRaca( rs.getString("raca") );
                p.setPeso( rs.getDouble("peso") );
                p.setNascimento( rs.getDate("nascimento").toLocalDate() );
                encontrados.add(p);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encontrados;
    }

    @Override
    public void atualizar(long id, Pet p) {

    }

    @Override
    public void remover(long id) {
        try (Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS)) {
            String sql = "DELETE FROM pet WHERE id = ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
