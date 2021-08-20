package edu.curso;

public class Empresa {

    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.nome = "João Silva";
        f1.cargo = "Programador";
        f1.salario = 2500.0f;

        f2.nome = "Maria Silva";
        f2.cargo = "Programador";
        f2.salario = 2500.0f;

//        float[] vetor = new float[2];
//        vetor[0] = 250.0f;
//        vetor[1] = 2500.f;

//        float[] vetor = {250.0f, 250.0f};
//        rh.pagarFuncionario(f1, vetor);

//        rh.pagarFuncionario(f1, new float[] {250.0f, 250.0f});
//        rh.pagarFuncionario(f2, new float[] {300.0f});

          rh.pagarFuncionario(f1, 250.0f, 250.0f, 150.0f);
          rh.pagarFuncionario(f2, 100.0f, 90.0f, 250.0f);
    }
}
