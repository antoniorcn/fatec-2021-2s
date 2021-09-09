package edu.curso;

public class FolhaPagamento<T extends Recebedor> {

    double totalPagamento = 0.0;

    public void pagar(T f) {
        double totalDescontos = f.salario - f.descontos;
        double totalPago = totalDescontos + f.bonus;
        totalPagamento += totalDescontos;
        totalPagamento += f.bonus;

        System.out.println("Pagamento ================");
        System.out.println("Salario => " + f.salario);
        System.out.println("Bonus => " + f.bonus);
        System.out.println("Descontos => " + f.descontos);
        System.out.println("Total => " + totalPago);
    }

}
