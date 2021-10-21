package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Aluno {
    private StringProperty nome = new SimpleStringProperty();
    public void setNome(String valor) {
        this.nome.set(valor);
    }
    public String getNome() {
        return this.nome.get();
    }
    public StringProperty getNomeProperty() {
        return this.nome;
    }
}
