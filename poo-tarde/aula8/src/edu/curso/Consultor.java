package edu.curso;

public class Consultor implements Pagavel {
    @Override
    public void receberPagamento(double valor) {
        System.out.println("Consultor recebendo " + valor);
    }
}
