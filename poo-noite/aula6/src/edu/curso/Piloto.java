package edu.curso;

public class Piloto extends Pessoa {
    String breve;
    double salario;
    int horasVoo;

    public Piloto() {
        super();
        System.out.println("Piloto criado...");
    }

    void fazerPlanoVoo() {
        System.out.println("Plano de voo traçado com combustível de reserva");
    }
}
