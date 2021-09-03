package edu.curso;

public class Pessoa {
    String nome;
    String documento;
    String passaporte;
    int idade;
    double peso;
    private Biometria senhaBiometria = new Biometria();

    String necessidadesEspeciais;

    public void fazerCheckIn() {
        System.out.println("Pessoa fazendo o Check In");
    }

    public Pessoa(String nome) {
        super();
        System.out.println("Pessoa sendo criada");
    }

    public Pessoa() {
        this("João Silva");
    }
}
