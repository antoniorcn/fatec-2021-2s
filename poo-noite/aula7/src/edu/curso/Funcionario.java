package edu.curso;

class Funcionario {
    public String nome;
    public double salario;
    double bonus;
    double descontos;

    public Funcionario(String nome, double salario, double bonus, double descontos) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
        this.descontos = descontos;
    }

    public double valorAReceber() {
        return this.salario + this.bonus - this.descontos;
    }
}
