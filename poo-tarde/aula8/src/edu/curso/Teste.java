package edu.curso;

public class Teste {
    public static void main(String[] args) {
        Caixa cx = new Caixa();
        Carro car = new Carro();
        Porta por = new Porta();

        Abrivel ob = por;
        ob.abrir();
    }
}
