package edu.curso;

public class Socio implements Credor {
    @Override
    public void receberPagamento(double valor) {
        System.out.println("Socio recebendo " + valor);
    }
}
