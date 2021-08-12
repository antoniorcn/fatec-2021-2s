package edu.curso;

import java.util.ArrayList;
import java.util.List;
public class EstouroHeap {
    public static void main(String[] args) {
        List<EstruturaGrande> lista = new ArrayList<>();
        long contador = 0;
        while (true) {
            EstruturaGrande e = new EstruturaGrande();
            lista.add(e);
            System.out.println(++contador);
        }
    }
}
