package edu.curso;

public class Empresa {

    void fazerPagamento(double valor, Credor credor) {
        credor.receberPagamento(valor);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        Socio s1 = new Socio();

        f1.calcularImposto();
        Credor.pagarImposto();

        Credor cred = new Credor() {
            @Override
            public void receberPagamento(double valor) {
                System.out.println("Agiota recebendo pagamento " + valor);
            }
        };

        empresa.fazerPagamento(2000, cred);
        empresa.fazerPagamento(10000, s1);
    }
}
