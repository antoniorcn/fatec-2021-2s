package edu.curso;

public class Passageiro extends Pessoa {
    String numeroAssento;
    String cartaoEmbarque;
    int volumeBagagem;
    int pesoBagagem;

    public void embarcar() {
        System.out.println("Pessoa embarcando");
    }
    public void desembarcar() {
        System.out.println("Pessoa desembarcando");
    }

    public Passageiro() {
        super();
        System.out.println("Passageiro sendo criado");
    }
}
