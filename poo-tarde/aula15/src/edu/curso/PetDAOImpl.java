package edu.curso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetDAOImpl implements PetDAO {
    private static final String URIDB = "jdbc:mariadb://localhost:3306/petdb?allowMultiQueries=true";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "123456";

    public PetDAOImpl() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URIDB, USUARIO, PASSWORD);
    }

    @Override
    public void adicionar(Pet pet) {
        try {
            Connection con = getConnection();
            String sql = "INSERT INTO pet (id, nome, raca, peso, nascimento) " +
                    "VALUES (?, ?, ?, ?, ?)";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, pet.getId());
            stmt.setString(2, pet.getNome());
            stmt.setString(3, pet.getRaca());
            stmt.setDouble(4, pet.getPeso());
            stmt.setDate(5, java.sql.Date.valueOf(pet.getNascimento()));
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Pet> pesquisarPorNome(String nome) {
        List<Pet> lista = new ArrayList<>();
        try {
            Connection con = getConnection();
            String sql = "SELECT * FROM pet WHERE nome like ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while( rs.next() ) {
                Pet p = new Pet();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setRaca(rs.getString("raca"));
                p.setPeso(rs.getDouble("peso"));
                p.setNascimento(rs.getDate("nascimento").toLocalDate());
                lista.add(p);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void remover(long id) {
        try {
            Connection con = getConnection();
            String sql = "DELETE FROM pet WHERE id = ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(long id, Pet pet) {
        try {
            Connection con = getConnection();
            String sql = "UPDATE pet SET nome = ?, raca = ?, peso = ?, nascimento = ? WHERE id = ?";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getRaca());
            stmt.setDouble(3, pet.getPeso());
            stmt.setDate(4, java.sql.Date.valueOf(pet.getNascimento()));
            stmt.setLong(5, pet.getId());
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
