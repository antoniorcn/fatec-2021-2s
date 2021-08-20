package edu.curso;

public class RecursosHumanos {

    public void pagarFuncionario(Funcionario f, float ... beneficios) {
        float valorAPagar = f.salario;
        for (int i = 0; i < beneficios.length; i++) {
            valorAPagar = valorAPagar + beneficios[i];
        }
        System.out.printf("Foi pago R$ %7.2f ao funcionario %s %n", valorAPagar, f.nome);
    }

//    public void pagarFuncionario(Funcionario f, float beneficio1, float beneficio2) {
//        float valorAPagar = f.salario + beneficio1 + beneficio2;
//        System.out.printf("Foi pago R$ %7.2f ao funcionario %s %n", valorAPagar, f.nome);
//    }
//
//    public void pagarFuncionario(Funcionario f) {
//        float valorAPagar = f.salario;
//        System.out.printf("Foi pago R$ %7.2f ao funcionario %s %n", valorAPagar, f.nome);
//    }
}
