package edu.curso;
public class EstouroMemoriaStack {
    static int contador = 0;
    static void fazAlgo() {
        System.out.println(contador++);
        fazAlgo();
    }
    public static void main(String[] args) {
        fazAlgo();
    }
}
