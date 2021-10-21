package edu.curso;

public class Aposentado implements Assinante {

    private String nome;

    public Aposentado(String nome) {
        this.nome = nome;
    }

    public void receberPublicacao(String publicacao) {
        System.out.println(this.nome  + " vai para a praça ler sobre " + publicacao);
    }
}
