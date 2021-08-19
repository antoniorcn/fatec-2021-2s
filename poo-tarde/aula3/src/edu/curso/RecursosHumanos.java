package edu.curso;

public class RecursosHumanos {

//    public void pagarFuncionario(Funcionario f, float beneficio) {
//        float valorTotal = f.salario + beneficio;
//        System.out.printf("Está sendo pago R$ %6.2f para o funcionario %s %n", valorTotal, f.nome);
//    }
//
//    public void pagarFuncionario(Funcionario f, float beneficio1, float beneficio2) {
//        float valorTotal = f.salario + beneficio1 + beneficio2;
//        System.out.printf("Está sendo pago R$ %6.2f para o funcionario %s %n", valorTotal, f.nome);
//    }
//
//    public void pagarFuncionario(Funcionario f, float beneficio1, float beneficio2, float beneficio3) {
//        float valorTotal = f.salario + beneficio1 + beneficio2 + beneficio3;
//        System.out.printf("Está sendo pago R$ %6.2f para o funcionario %s %n", valorTotal, f.nome);
//    }


//    public void pagarFuncionario(Funcionario f, float[] beneficios) {
//        float valorTotal = f.salario;
//        for (int i = 0; i < beneficios.length; i++) {
//            valorTotal = valorTotal + beneficios[i];
//        }
//
//        System.out.printf("Está sendo pago R$ %6.2f para o funcionario %s %n", valorTotal, f.nome);
//    }

    public void pagarFuncionario(Funcionario f, float ... beneficios) {
        float valorTotal = f.salario;
        for (int i = 0; i < beneficios.length; i++) {
            valorTotal = valorTotal + beneficios[i];
        }

        System.out.printf("Está sendo pago R$ %6.2f para o funcionario %s %n", valorTotal, f.nome);
    }

}
