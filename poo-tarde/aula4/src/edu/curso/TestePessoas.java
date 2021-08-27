package edu.curso;

public class TestePessoas {

    public static void main(String args[]) {
        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();

        joao.setIdade(23);
        maria.setIdade(2 - joao.getIdade());
        // maria.idade = -50;

        System.out.println("Idade do João ==>" + joao.getIdade());
        System.out.println("Idade da Maria ==>" + maria.getIdade());

        Celular motorola = new Celular();
        Celular lg = new Celular();

        joao.celular = motorola;
        maria.celular = lg;

        joao.celular = lg;
        maria.celular = motorola;


        // joao.figado = new Figado();
        // maria.figado = new Figado();
        // Não dá para mexer porque é composição


    }
}
