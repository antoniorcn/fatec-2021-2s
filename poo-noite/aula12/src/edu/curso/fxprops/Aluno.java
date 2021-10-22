package edu.curso.fxprops;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
    private String nome = "";
    private StringProperty serie = new SimpleStringProperty("");

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public StringProperty serieProperty() {
        return serie;
    }

}
