package edu.curso;

public interface Pagavel {
    int linhas = 66;
    void receberPagamento(double valor);

    default void calcularImposto() {
        System.out.println("Calculando imposto...");
    }

    static void fazerGreve() {
        System.out.println("Fazendo greve");
    }
}
