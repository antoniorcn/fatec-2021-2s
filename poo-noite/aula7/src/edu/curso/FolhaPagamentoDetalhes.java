package edu.curso;

public class FolhaPagamentoDetalhes extends FolhaPagamento {
    @Override
    public void pagarSalario(Funcionario f) {
        this.totalPago += f.valorAReceber();
        System.out.println("=== Valor pago a " + f.nome +
                " === " + f.valorAReceber() +
                " === Total pago até o momento =>" +
                this.totalPago);
    }
}
