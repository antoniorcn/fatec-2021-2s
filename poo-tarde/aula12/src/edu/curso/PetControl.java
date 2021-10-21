package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class PetControl {

    private List<Pet> pets = new ArrayList<>();

    public void adicionar(Pet p) {
        if (p != null) {
            pets.add(p);
        }
    }

    public Pet pesquisar( String nome ) {
        for (Pet p : pets) {
            if (p.getNome().contains(nome)) {
                return p;
            }
        }
        return null;
    }
}
