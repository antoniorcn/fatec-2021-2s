package edu.curso.observer;

public class MundoReal {
    public static void main(String[] args) {
        Publicadora estadao = new Jornal("Estadão");
        Publicadora globo = new Jornal("O Globo");
        Publicadora veja = new Revista();

        Assinante joao = new Economista("João");
        Assinante maria = new Economista("Maria");
        Assinante alfredo = new Economista("Alfredo");
        Assinante irineu = new Aposentado();


        estadao.adicionar(joao);
        globo.adicionar(maria);
        estadao.adicionar(alfredo);
        globo.adicionar(alfredo);
        globo.remover(alfredo);
        veja.adicionar(alfredo);
        estadao.adicionar(irineu);

        estadao.publicarNoticia("Funchal reuniu equipe e disse que era " +
                "questão de princípio manter o teto de gastos");
        globo.publicarNoticia("Secretários do Tesouro e do Orçamento da equipe de " +
                "Guedes pedem demissão em meio à crise do teto de gastos");

        veja.publicarNoticia("Depois de governo “driblar” teto, secretários de Guedes pedem demissão");
    }
}
