package edu.curso;

public class Pessoa {

    String nome;
    String cpf;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int valor) {
        if (valor >= 0) {
            this.idade = valor;
        }
    }

    private Figado figado; // Composição

//    private Celular celular; // Agregação
//
//    public Celular getCelular() {
//        return celular;
//    }
//
//    public void setCelular(Celular c) {
//        this.celular = c;
//    }

    public Celular celular;
}
