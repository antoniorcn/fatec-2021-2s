package edu.curso;

public class Estudante implements Assinante {

    @Override
    public void receberPublicacao(String publicacao) {
        System.out.println("O estudante está lendo sobre " + publicacao + " na facudlade");
    }
}
