package edu.curso;

public class TesteArmario {
    public static void main(String[] args) {
        Armario a1 = new Armario();
        Armario a2 = new Armario();

        a1.cor = "cerejeira";
        a1.tamanhoArmario = 20;

        a2.cor = "mogno";
        a2.tamanhoArmario = 10;

        a1.esvaziarArmario();
        a2.esvaziarArmario();



//        a2.guardarAlgo();
//        a2.guardarAlgo();
        a2.guardar(5);

        a2.abrirPorta();
        a2.guardar(4);
        a2.guardar(2);

        a2.fecharPorta();

//        a1.guardarAlgo();

    }
}
