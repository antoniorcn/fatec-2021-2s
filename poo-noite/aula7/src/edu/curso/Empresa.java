package edu.curso;

public class Empresa {
    public static void main(String[] args) {
        FolhaPagamento dp = new FolhaPagamentoDetalhes();
        GrupoTrabalho<Funcionario> grupo = new GrupoTrabalho<>(new Funcionario[10]);
        Funcionario joao = new Funcionario("João",
                1500.00, 300.00, 270.00);

        Funcionario maria = new Funcionario("Maria",
                1800.00, 200.00, 300.00);

        grupo.adicionar(joao);
        grupo.adicionar(maria);

        dp.pagarSalario(joao);
        dp.pagarSalario(maria);

        GrupoTrabalho<Aluno> grupo2 = new GrupoTrabalho<>(new Aluno[10]);
        Aluno a1 = new Aluno();
        grupo2.adicionar(a1);
    }
}
