package edu.curso;
public class Empresa {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.trabalhar();
        f.fazerHoraExtra();

        Gerente g = new Gerente();
        g.liderar();


    }
}
