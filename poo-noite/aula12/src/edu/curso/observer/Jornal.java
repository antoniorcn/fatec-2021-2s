package edu.curso.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publicadora {

    private String nome;
    private List<Assinante> assinantes = new ArrayList<>();

    public Jornal(String n) {
        this.nome = n;
    }

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
        System.out.println("Jornal " + this.nome + " publica " + noticia);
        for(Assinante a : assinantes) {
            a.receberNoticia(noticia);
        }
    }
}
