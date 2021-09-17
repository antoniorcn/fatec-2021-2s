package edu.curso;

public interface Credor {
    void receberPagamento(double valor);

    default void calcularImposto() {
        System.out.println("Calculando imposto");
    }

    static void pagarImposto() {
        System.out.println("Pagando imposto");
    }
}
