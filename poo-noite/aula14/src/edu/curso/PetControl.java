package edu.curso;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PetControl {

    private static final String DBURL = "jdbc:mariadb://localhost:3306/petdb";
    private static final String DBUSER = "root";
    private static final String DBPASS = "123456";

    LongProperty id = new SimpleLongProperty(0);
    StringProperty nome = new SimpleStringProperty("");
    StringProperty raca = new SimpleStringProperty("");
    DoubleProperty peso = new SimpleDoubleProperty(0);
    ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());

    private static long counter = 0;

    private List<Pet> lista = new ArrayList<>();
    private ObservableList<Pet> listaView = FXCollections.observableArrayList();

    public Pet getEntity() {
        Pet p = new Pet();
        p.setId(id.get());
        p.setNome(nome.get());
        p.setRaca(raca.get());
        p.setPeso(peso.get());
        p.setNascimento((LocalDate)nascimento.get());
        return p;
    }

    public void setEntity(Pet p) {
        id.set(p.getId());
        nome.set(p.getNome());
        raca.set(p.getRaca());
        peso.set(p.getPeso());
        nascimento.set(p.getNascimento());
    }

    public void salvar() {
        Pet p = getEntity();
//        boolean encontrado = false;
//        for (int i = 0; i < lista.size(); i++) {
//            Pet pet = lista.get(i);
//            if (p.getId() == pet.getId()) {
//                lista.set(i, p);
//                encontrado = true;
//                break;
//            }
//        }
//
//        if (!encontrado) {
//            lista.add(p);
//        }

        try {
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            String sql = String.format(Locale.ROOT,
                    "INSERT INTO pet (id, nome, raca, peso, nascimento)  " +
                            "VALUES (%d, '%s', '%s', %f, '%s')",
                    p.getId(),
                    p.getNome(),
                    p.getRaca(),
                    p.getPeso(),
                    p.getNascimento()
                    );

            System.out.println(sql);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        atualizarListaView();
    }

    public void novoPet() {
        Pet p = new Pet();
        p.setId(++counter);
        setEntity(p);
    }

    public void pesquisar() {
        listaView.clear();
//        for(Pet p : lista) {
//            if (p.getNome().contains(nome.get())) {
//                listaView.add(p);
//               // setEntity(p);
//               // break;
//            }
//        }
        try {
            Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            String sql = "SELECT * FROM pet WHERE nome like '%" + nome.get() + "%'";
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
                listaView.add(p);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void remover(long id) {
        for (Pet p : lista) {
            if (p.getId() == id) {
                lista.remove(p);
                break;
            }
        }
        atualizarListaView();
    }

    public void atualizarListaView() {
        listaView.clear();
        listaView.addAll(lista);
    }

    public ObservableList<Pet> getListaView() {
        return listaView;
    }
}
