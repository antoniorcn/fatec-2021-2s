package edu.curso;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro(12.0f);
        Carro c2 = new Carro(14.0f);
        Carro c3 = new Carro();
        c1.marca = "FIAT";
        c1.modelo = "UNO";
//        c1.consumo = 12.0f;
//        c2.marca = "GM";
//        c2.modelo = "CELTA";
//        c2.consumo = 14.0f;

        c2.iniciarCarro();
//        c2.consumo = 14.0f;

        c1.acelerar();
        c1.ligar();
        c1.acelerar();
        c1.soltarFreioMao();
        c1.acelerar();
        c1.acelerar();

        c2.acelerar();
        c2.ligar();
        c2.soltarFreioMao();
        c2.acelerar();

        c1.viajar(75.0f);

        c2.viajar(75.0f, 60.0f);

        c2.viajar(25.0f, 9.7f, 9.7f, 34.0f);
    }
}
