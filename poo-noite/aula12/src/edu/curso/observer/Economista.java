package edu.curso.observer;

public class Economista implements Assinante {

    private String nome;

    public Economista(String n) {
        this.nome = n;
    }

    @Override
    public void receberNoticia(String noticia) {
        System.out.println("O economista " + this.nome +
                " está lendo a noticia " + noticia + " enquanto engraxa os sapatos");
    }
}
