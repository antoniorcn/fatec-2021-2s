package edu.curso.observer;

public class Aposentado implements Assinante {
    @Override
    public void receberNoticia(String noticia) {
        System.out.println("Aposentado está lendo a noticia " + noticia + " na praça");
    }
}
