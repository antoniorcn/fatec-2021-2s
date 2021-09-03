package edu.curso;

public class Passageiro extends Pessoa {
    String numeroTicket;
    String destino;
    String numeroAssento;
    // double peso = 90.0;

    public Passageiro() {
        super();
        this.passaporte = "11111";
        System.out.println("Passageiro criado...");
    }

    void checkIn() {
        System.out.println("Tudo pronto para o embarque, tenho a passagem em mãos");
    }
}
