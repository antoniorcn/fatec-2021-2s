package edu.curso.observer;

public interface Publicadora {
    void adicionar(Assinante a);
    void remover(Assinante a);
    void publicarNoticia(String noticia);
}
