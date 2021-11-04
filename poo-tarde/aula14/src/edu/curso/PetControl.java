package edu.curso;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PetControl {

    private static final String URIDB = "jdbc:mariadb://localhost:3306/petdb";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "123456";

    LongProperty id = new SimpleLongProperty(0);
    StringProperty nome = new SimpleStringProperty("");
    StringProperty raca = new SimpleStringProperty("");
    DoubleProperty peso = new SimpleDoubleProperty(0);
    ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());

    private static long counter = 0;

    // private List<Pet> pets = new ArrayList<>();
    private List<Pet> petsGeral = new ArrayList<>();
    private ObservableList<Pet> pets = FXCollections.observableArrayList();


    public PetControl() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URIDB, USUARIO, PASSWORD);
    }

    public void adicionar() {
//        Pet p = toEntity();
        Pet p = new Pet();
        p.setId(++counter);
        // pets.add(p);
        fromEntity(p);
    }

    public void pesquisar() {
        pets.clear();
//        for (Pet p : petsGeral) {
//            if (p.getNome().contains( nome.get() )) {
////                fromEntity(p);
////                break;
//                pets.add(p);
//            }
//        }

        try {
            Connection con = getConnection();
            String sql = "SELECT * FROM pet WHERE nome like '%" + nome.get() + "%'";
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while( rs.next() ) {
                Pet p = new Pet();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                p.setRaca(rs.getString("raca"));
                p.setPeso(rs.getDouble("peso"));
                p.setNascimento(rs.getDate("nascimento").toLocalDate());
                pets.add(p);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (!pets.isEmpty()) {
            fromEntity(pets.get(0));
        }
    }

    public void alterar() {
        Pet pet = toEntity();

        try {
            Connection con = getConnection();
            String sql = String.format(Locale.ROOT, "INSERT INTO pet (id, nome, raca, peso, nascimento) " +
                    "VALUES (%d, '%s', '%s', %f, '%s')",
                    pet.getId(),
                    pet.getNome(),
                    pet.getRaca(),
                    pet.getPeso(),
                    pet.getNascimento());
            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


//        boolean encontrado = false;
//        for (int i = 0; i < petsGeral.size(); i++) {
//            Pet p = petsGeral.get(i);
//            if (id.get() == p.getId()) {
//                petsGeral.set(i, pet);
//                encontrado = true;
//
//                this.updateLista();
//            }
//        }

//        if (! encontrado) {
//            petsGeral.add(pet);
//
//            this.updateLista();
//        }


    }

    private void updateLista() {
        pets.clear();
        pets.addAll(petsGeral);
    }

    public Pet toEntity() {
        Pet p = new Pet();
        p.setId(id.get());
        p.setNome(nome.get());
        p.setRaca(raca.get());
        p.setPeso(peso.get());
        p.setNascimento((LocalDate)nascimento.get());
        return p;
    }

    public void fromEntity(Pet p) {
        id.set(p.getId());
        nome.set(p.getNome());
        raca.set(p.getRaca());
        peso.set(p.getPeso());
        nascimento.set(p.getNascimento());
    }

    public ObservableList<Pet> getLista() {
        return pets;
    }

}
