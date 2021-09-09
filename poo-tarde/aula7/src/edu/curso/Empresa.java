package edu.curso;

public class Empresa {

    public static void main(String[] args) {
        Funcionario maria = new Funcionario();
        Funcionario joao = new Funcionario();
        Funcionario antonio = new Coordenador();
        AlunoBolsista a1 = new AlunoBolsista();
        AlunoBolsista a2 = new AlunoBolsista();
        a1.salario = 500.0;
        a2.salario = 500.0;
        maria.nivel = 2;
        maria.calcularSalario();
        joao.calcularSalario();
        antonio.calcularSalario();

        FolhaPagamento<Funcionario> dp = new FolhaPagamento<>();
        // Object a1 = new Object();
        dp.pagar(maria);
        dp.pagar(joao);
        dp.pagar(antonio);
        // dp.pagar(a1);

        FolhaPagamento<AlunoBolsista> rhGov = new FolhaPagamento<>();
        rhGov.pagar(a1);
        // rhGov.pagar(maria);
    }
}
