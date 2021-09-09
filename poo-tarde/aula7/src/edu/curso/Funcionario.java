package edu.curso;

public abstract class Funcionario extends Recebedor {

    public final static double SALARIO_MINIMO = 1000.0;

    int nivel = 1;

    void calcularSalario() {
        this.salario = Funcionario.SALARIO_MINIMO * this.nivel;
        this.bonus = this.salario * 0.30;
        this.descontos = this.salario * 0.25;
    }

    abstract void trabalhar();
}
