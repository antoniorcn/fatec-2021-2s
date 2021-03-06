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

    private static long counter = 0;

    // private List<Pet> pets = new ArrayList<>();
    private List<Pet> petsGeral = new ArrayList<>();
    private ObservableList<Pet> pets = FXCollections.observableArrayList();

    public void adicionar() {
//        Pet p = toEntity();
        Pet p = new Pet();
        p.setId(++counter);
        // pets.add(p);
        fromEntity(p);
    }

    public void pesquisar() {
        pets.clear();
        for (Pet p : petsGeral) {
            if (p.getNome().contains( nome.get() )) {
//                fromEntity(p);
//                break;
                pets.add(p);
            }
        }

        if (!pets.isEmpty()) {
            fromEntity(pets.get(0));
        }
    }

    public void alterar() {
        Pet pet = toEntity();
        boolean encontrado = false;
        for (int i = 0; i < petsGeral.size(); i++) {
            Pet p = petsGeral.get(i);
            if (id.get() == p.getId()) {
                petsGeral.set(i, pet);
                encontrado = true;

                this.updateLista();
            }
        }

        if (! encontrado) {
            petsGeral.add(pet);

            this.updateLista();
        }
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
