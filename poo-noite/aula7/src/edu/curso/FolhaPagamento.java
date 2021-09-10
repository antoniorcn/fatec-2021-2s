package edu.curso;

public class FolhaPagamento {

    double totalPago;

    public void pagarSalario(Funcionario f) {
        this.totalPago += f.valorAReceber();
        System.out.println("========== Total pago até o momento =>" +
                this.totalPago);
    }
}
