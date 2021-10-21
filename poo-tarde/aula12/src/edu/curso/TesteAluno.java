package edu.curso;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

class MudancaNome implements ChangeListener<String> {
    @Override
    public void changed(ObservableValue<? extends String> observable,
                        String oldValue, String newValue) {
        System.out.println(observable.getValue());
        System.out.println("O nome foi trocado de " + oldValue + " para " + newValue);
    }
}

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
//        MudancaNome observador = new MudancaNome();
//        a.getNomeProperty().addListener( observador );

        a.getNomeProperty().addListener((obs, oldValue, newValue) -> {
            System.out.println(obs.getValue());
            System.out.println("Trocado de " + oldValue + " para " + newValue);
        });

        a.setNome("José");
        a.setNome("João");
        a.setNome("Maria");
        a.setNome("Alfredo");
        System.out.println("Nome atual ==> " + a.getNome());
    }
}
