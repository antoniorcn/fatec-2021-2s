package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteLeitura {
    private static final String URLDB = "jdbc:mariadb://127.0.0.1:3306/petdb";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(URLDB, USUARIO, PASSWORD);
            String sql = "SELECT * FROM pet";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resposta = stmt.executeQuery();

            while (resposta.next()) {
                System.out.println(resposta.getString("raca"));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
