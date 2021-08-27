package edu.curso;

public class Carro {
    String fabricante;
    String modelo;
    int anoFabricacao;
    Pneu p1;
    Pneu p2;
    Pneu p3;
    Pneu p4;
    Porta porta1;
    Porta porta2;
    private Motor m1 = new Motor();

    public void acelerar() {
        System.out.println("Acelerando...");
    }

}
