package edu.curso;

public class ExtratoBancario {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        String extrato = "";
        // StringBuffer extrato = new StringBuffer("");
        for (int lanc = 0; lanc < 100000; lanc++) {
            extrato = extrato + lanc + "\n";
            // extrato.append(lanc + "\n");
        }
        long termino = System.currentTimeMillis();
        long dif = termino - inicio;
        System.out.println(dif);
    }
}
