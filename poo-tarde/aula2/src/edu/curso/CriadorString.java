package edu.curso;

public class CriadorString {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        // String transacoesBancarias = "";
        // StringBuilder transacoesBancarias = new StringBuilder("");
        StringBuffer transacoesBancarias = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            // transacoesBancarias = transacoesBancarias + i + "\n";
            transacoesBancarias.append(i + "\n");
        }
        long fim = System.currentTimeMillis();
        // System.out.println(transacoesBancarias);
        double dif = (fim - inicio) / 1000;
        System.out.printf("Tempo gasto: %6.1f%n", dif);

    }
}
