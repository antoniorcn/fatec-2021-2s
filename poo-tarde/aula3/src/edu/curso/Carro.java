package edu.curso;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    float litrosTanque;
    float consumo;        // Km/litro
    String cor;
    boolean ligado;
    boolean freioMaoPuxado = true;
    float velocidade = 0.0f;

    public Carro(float consumo) {
        this.consumo = consumo;
    }

    public Carro() {

    }


    public void ligar() {
        int a = 10;
        System.out.println("Veiculo ligado");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("Veiculo desligado");
        this.ligado = false;
    }

    public void puxarFreioMao() {
        System.out.println("Freio de mão puxado");
        this.freioMaoPuxado = true;
    }

    public void soltarFreioMao() {
        System.out.println("Freio de mão solto");
        this.freioMaoPuxado = false;
    }

    public void acelerar() {
        // velocidade = (float)(velocidade + 10.0);
        String txtLigado = this.ligado ? "Ligado" : "Desligado";
        System.out.printf("O carro esta %s %n", txtLigado);

        if (this.ligado) {
            if (!freioMaoPuxado) {
                System.out.println("Vrummm....");
                this.velocidade = this.velocidade + 10.0f;
                // System.out.println("O carro esta a " + velocidade + " km/hora");
                // System.out.printf("O carro esta ligado: %b e rodando a %5.1f km/hora %n", ligado, velocidade);
                System.out.printf("O carro esta rodando a %5.1f km/hora %n", this.velocidade);
            } else {
                System.out.println("É preciso soltar o freio de mão");
            }
        } else {
            System.out.println("É preciso ligar o carro primeiro");
        }
    }

    public void frear() {
        System.out.println("Screeech! iééé!");
        velocidade = velocidade - 10.0f;
    }

//    public void viajar(float km, float km2) {
//        float litros = (km / consumo) + (km2 / consumo);
//        System.out.printf("Foram gastos %5.1f litros de combustivel %n", litros);
//    }

    public void viajar(float... kms) {
        float somaLitros = 0.0f;
        for (int i = 0; i < kms.length; i++) {
            somaLitros += kms[i] / consumo;
        }
        System.out.printf("Foram gastos %5.1f litros de combustivel em %d viagens%n", somaLitros, kms.length);
    }

    public void iniciarCarro() {
        this.marca = "GM";
        this.modelo = "CORSA";
        this.consumo = 13.0f;
        this.cor = "PRETA";
    }
}
