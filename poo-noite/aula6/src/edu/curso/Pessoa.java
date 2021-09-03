package edu.curso;

public class Pessoa {
    private double peso = 65.4;
    protected String passaporte;
    String nome;
    String cpf;
    int idade;

    public void setPeso(double valor) {
        this.peso = valor;
    }

    public double getPeso() {
        return this.peso;
    }

    public Pessoa(String nome, int idade, String cpf) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(String nome, int idade) {
        this(nome, idade, null);
//        super();
//        this.nome = nome;
//        this.idade = idade;
    }

    public Pessoa(String nome) {
        this(nome, 0);
//        super();
//        this.nome = nome;
    }

    public Pessoa() {
        this("Anônima");
        System.out.println("Pessoa criada...");
    }

    void comprarPassagem() {
        System.out.println("Passagem comprada, eba... ");
    }
}
