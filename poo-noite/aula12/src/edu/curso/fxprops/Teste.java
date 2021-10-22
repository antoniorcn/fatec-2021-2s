package edu.curso.fxprops;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

class Obs implements ChangeListener<String> {
    @Override
    public void changed(ObservableValue<? extends String> observable,
                        String oldValue, String newValue) {
        System.out.println("Serie foi alterada de " + oldValue + " para " + newValue);
    }
}

public class Teste {
    public static void main(String[] args) {
        Obs o = new Obs();

        Aluno jose = new Aluno();
        jose.serieProperty().addListener(o);
        jose.setNome("Jose");
        jose.serieProperty().set("2o semestre");
        jose.serieProperty().set("3o semestre");



        System.out.println("Nome: " + jose.getNome() + " serie " + jose.serieProperty().get());
    }
}
