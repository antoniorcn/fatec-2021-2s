package edu.curso;

public class Aeroporto {

    Aeronave[] listaAeronave = new Aeronave[10];
    String[] companhiaAerea = new String[5];
    Pessoa[] saguaoPrincipal = new Pessoa[1000];
    Passageiro[] salaEmbarque = new Passageiro[200];

    void abrir() {
        System.out.println("Aeroporto aberto");
    }

    void fechar() {
        System.out.println("Aeroporto fechado devido a condições climáticas");
    }

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa();

        Passageiro pas1 = new Passageiro();

        Pessoa p2 = new Passageiro();

        // Passageiro pas2 = new Pessoa();

    }
}
