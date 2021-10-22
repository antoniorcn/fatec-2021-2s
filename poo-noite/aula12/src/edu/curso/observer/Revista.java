package edu.curso.observer;

import java.util.ArrayList;
import java.util.List;

public class Revista implements Publicadora {
    private List<Assinante> assinantes = new ArrayList<>();

    @Override
    public void adicionar(Assinante a) {
        assinantes.add(a);
    }

    @Override
    public void remover(Assinante a) {
        assinantes.remove(a);
    }

    @Override
    public void publicarNoticia(String noticia) {
        System.out.println("Revista publica " + noticia);
        for(Assinante a : assinantes) {
            a.receberNoticia(noticia);
        }
    }
}
