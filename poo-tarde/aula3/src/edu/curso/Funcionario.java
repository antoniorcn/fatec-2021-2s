package edu.curso;

public class Funcionario {
    long id;
    String nome;
    String cargo;
    float salario;

    public Funcionario() {
        this.salario = 3130.67f;
        this.cargo = "Programador";
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 3130.67f;
        this.cargo = "Programador";
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 3130.67f;
    }

//    public void iniciar() {
//        this.salario = 3130.67f;
//        this.cargo = "Programador";
//    }
}
