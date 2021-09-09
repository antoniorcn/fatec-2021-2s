package edu.curso;

public class Coordenador extends Funcionario {
    @Override
    public void calcularSalario() {
        this.nivel = 3;
        double bonus = 0.0;
        this.salario = Funcionario.SALARIO_MINIMO * this.nivel;
        this.bonus = this.salario * 0.70;
        this.descontos = this.salario * 0.25;
    }

    public void trabalhar() {

    }
}
