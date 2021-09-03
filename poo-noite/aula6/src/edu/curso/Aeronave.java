package edu.curso;

public class Aeronave {
    String prefixo;
    int velocidade;
    String modelo;
    Piloto[] pilotos = new Piloto[3];
    Passageiro[] passageiros = new Passageiro[150];

    void decolar() {
        System.out.println("Decolamos....");
    }

    void aterrizar() {
        System.out.println("Aterrizamos com sucesso...");
    }
}
