package edu.curso;

public class Funcionario implements Assalariado {
    @Override
    public void receberPagamento(double valor) {
        System.out.println(getClass().getSimpleName() + " recebendo " + valor);
    }

    @Override
    public void fazerTrabalho() {
        System.out.println("Funcionario fazendo trabalho...");
    }
}
