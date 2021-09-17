package edu.curso;

public class UberLaska {

    public void corrida(String origem, String destino, Movivel locomocao) {
        System.out.println("Viagem de ==> " + origem);
        System.out.println("Para ==> " + destino);
        locomocao.mover();
    }
}
