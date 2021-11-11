package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TesteConexao {
    private static final String URLDB = "jdbc:mariadb://127.0.0.1:3306/petdb";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        try {
            System.out.println("Iniciando teste de conexão com o Banco de dados");

            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Classe carregada");

            Connection con = DriverManager.getConnection(URLDB, USUARIO, PASSWORD);
            System.out.println("Conectado no banco de dados");

            String sql = "INSERT INTO pet (id, nome, raca, peso, nascimento)\n" +
                    "VALUES (1, 'Toto', 'Viralata', 15.6, '2018-09-23');";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();

            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
