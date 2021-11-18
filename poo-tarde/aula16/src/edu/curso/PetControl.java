package edu.curso;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PetControl {

    LongProperty id = new SimpleLongProperty(0);
    StringProperty nome = new SimpleStringProperty("");
    StringProperty raca = new SimpleStringProperty("");
    DoubleProperty peso = new SimpleDoubleProperty(0);
    ObjectProperty nascimento = new SimpleObjectProperty(LocalDate.now());

    private PetDAO petDAO = new PetDAOImpl();

    private List<Pet> petsGeral = new ArrayList<>();
    private ObservableList<Pet> pets = FXCollections.observableArrayList();

    public void adicionar() {
        Pet p = new Pet();
        fromEntity(p);
    }

    public void pesquisar() {
        pets.clear();
        List<Pet> encontrados = petDAO.pesquisarPorNome( nome.get() );
        pets.addAll( encontrados );
        if (!pets.isEmpty()) {
            fromEntity(pets.get(0));
        }
    }

    public void salvar() {
        Pet pet = toEntity();
        if (pet.getId() == 0) {
            petDAO.adicionar( pet );
        } else {
            petDAO.atualizar( id.get(), pet );
        }
    }

    public void remover(long id) {
        petDAO.remover(id);
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
