package edu.curso;

public class Empresa {

    public void fazerPagamento(Pagavel obj, double valor) {
        obj.receberPagamento(valor);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario f1 = new Funcionario();
        Consultor c1 = new Consultor();

//        Pagavel pag = new Pagavel() {
//            public void receberPagamento(double valor) {
//
//            }
//        };



        Pagavel pag = f1;
        pag.calcularImposto();
        Pagavel.fazerGreve();

        empresa.fazerPagamento(f1, 1000);
        empresa.fazerPagamento(c1, 1500);
    }
}
