package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteConexao {
    private static final String DBURL = "jdbc:mariadb://localhost:3306/petdb";
    private static final String DBUSER = "root";
    private static final String DBPASS= "123456";

    public static void main(String[] args) throws Exception {
        System.out.println("Teste de conexão em DB");
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("Classe de conexao carregada");
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        System.out.println("Conectado no banco de dados");

//        String sql = "INSERT INTO pet (id, nome, raca, peso, nascimento) " +
//                "VALUES (1, 'Toto', 'ViraLata', 10.76, '2017-11-09')";
//
//        PreparedStatement stmt = con.prepareStatement(sql);
//        stmt.executeUpdate();

        String sql = "SELECT * FROM pet";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getDouble("peso"));
        }

        con.close();
    }
}
