package edu.curso;

public class PizzaMussarela extends Pizza {
    public void preparar() {
        System.out.println("Pizza sendo preparada com molho e queijo mussarela, tomate e oregano");
    }

    public void assar() {
        System.out.println("Pizza de mussarela sendo assada no forno em 5 minutos");
    }

    public void servir() {
        System.out.println("Pizza sendo dividida em 8 fatias e servida com azeite");
    }
}
