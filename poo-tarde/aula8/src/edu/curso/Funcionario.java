package edu.curso;

public class Funcionario extends Pessoa
        implements Pagavel, Prestavel {

    double valorImposto;

    @Override
    public void receberPagamento(double valor) {
        System.out.println("Funcionario recebendo " + valor);
    }

    @Override
    public void prestarServico() {
        System.out.println("Funcionario trabalhando...");
    }

    @Override
    public void calcularImposto() {
        Pagavel.super.calcularImposto();
        System.out.println("Imposto de funcionario");
        this.valorImposto = 10;
    }
}
