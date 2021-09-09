package edu.curso;

public class TesteMatematica {

    public static void main(String[] args) {
        Matematica<Float> m = new Matematica<>();
        double soma = m.somar(10.3f, 20.1f);
        System.out.println(soma);
    }
}
