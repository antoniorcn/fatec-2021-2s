package edu.curso;
public class Funcionario {
    public void trabalhar() {
        System.out.println("Funcionario Trabalhando");
    }

    public void fazerHoraExtra() {
        trabalhar();
        System.out.println("Fazendo hora extra");
    }
}
