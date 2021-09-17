package edu.curso;

public class Cartesiano {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(5, 1);
        Ponto p2 = new Ponto(-3, 2);
        Ponto.multiplicador(1, 1);
        System.out.println("Distancia X ==> " + p1.distanciaX());

        System.out.println("PI ==> " + Ponto.PI);
        Ponto.PI = 3.14158;
        System.out.println("PI ==> " + Ponto.PI);
    }
}
