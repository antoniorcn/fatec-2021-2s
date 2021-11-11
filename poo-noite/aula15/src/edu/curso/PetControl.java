package edu.curso;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.List;

public class PetControl {
    LongProperty id = new SimpleLongProperty(0);
    StringProperty nome = new SimpleStringProperty("");
    StringProperty raca = new SimpleStringProperty("");
    DoubleProperty peso = new SimpleDoubleProperty(0);
    ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());

    private ObservableList<Pet> listaView = FXCollections.observableArrayList();
    private PetDAO petDAO = new PetDAOImpl();

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
        if (p.getId() == 0) {
            petDAO.adicionar(p);
            setEntity(new Pet());
        } else {
            petDAO.atualizar(id.get(), p);
        }
        atualizarListaView();
    }

    public void novoPet() {
        Pet p = new Pet();
        p.setId(0);
        setEntity(p);
    }

    public void pesquisar() {
        listaView.clear();
        List<Pet> encontrados = petDAO.pesquisarPorNome(nome.get());
        listaView.addAll(encontrados);
    }

    public void remover(long id) {
        petDAO.remover(id);
        atualizarListaView();
    }

    public void atualizarListaView() {
        listaView.clear();
        listaView.addAll(petDAO.pesquisarPorNome(""));
    }

    public ObservableList<Pet> getListaView() {
        return listaView;
    }
}
