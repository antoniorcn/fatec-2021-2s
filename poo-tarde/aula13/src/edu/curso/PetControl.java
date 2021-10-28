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

    // private List<Pet> pets = new ArrayList<>();
    private ObservableList<Pet> pets = FXCollections.observableArrayList();

    public void adicionar() {
        Pet p = toEntity();
        pets.add(p);
        fromEntity(new Pet());
    }

    public void pesquisar() {
        for (Pet p : pets) {
            if (p.getNome().contains( nome.get() )) {
                fromEntity(p);
                break;
            }
        }
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
