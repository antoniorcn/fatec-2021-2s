package edu.outro;

public class Zoologico extends Cachorro {

    public void run() {
        dormir();
        comer();
        mover();
        emitirSom();
    }

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.emitirSom();
        c.mover();
        c.comer();
        c.dormir();

    }
}
