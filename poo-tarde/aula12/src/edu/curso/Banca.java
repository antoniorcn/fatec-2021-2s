package edu.curso;

public class Banca {
    public static void main(String[] args) {
        Publicadora veja = new Revista();
        Publicadora istoe = new Revista();

        Assinante joao = new Aposentado("João");
        Assinante maria = new Aposentado("Maria");
        Assinante alfredo = new Aposentado("Alfredo");

        Estudante e = new Estudante();

        veja.adicionar(joao);
        istoe.adicionar(maria);
        veja.adicionar(alfredo);
        istoe.adicionar(alfredo);
        istoe.adicionar( e );


        veja.encaminharPublicacao("‘Licença para gastar’ de Guedes estressa dólar e é desafio para inflação");
        istoe.encaminharPublicacao("Bolsonaro repete que governo não furará teto, apesar de Guedes admitir manobra");
    }
}
