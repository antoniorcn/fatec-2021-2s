package edu.outro;
import edu.curso.Animal;
public class Cachorro
       extends Animal
{
    public void passarDia() {
        emitirSom();
        mover();
        comer();
        dormir();

        Animal c = new Animal();
        c.emitirSom();
        c.mover();
        c.comer();
        c.dormir();
    }

}
