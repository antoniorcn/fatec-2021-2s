package edu.curso;
public class TesteEmpresa {
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();

        Funcionario f1 = new Funcionario("João Silva");
        Funcionario f2 = new Funcionario("Maria Silva");
        Funcionario f3 = new Funcionario("Luiz Carlos", "Gerente");
        Funcionario f4 = new Funcionario("Carolina Ferraz");

        // f1.nome = "João Silva";
        // f1.iniciar();

        // f2.nome = "Maria Silva";
        // f2.iniciar();

        // f4.nome = "Carolina Ferraz";
        // f4.iniciar();

        //f3.nome = "Luiz Carlos";
        //f3.iniciar();
        f3.salario = 5421.89f;
        // f3.cargo = "Gerente";

//        rh.pagarFuncionario(f1, new float[] {200.0f, 100.0f});
//        rh.pagarFuncionario(f2, new float[] {210.0f});
//        rh.pagarFuncionario(f3, new float[] {250.0f, 150.0f, 350.0f});

        rh.pagarFuncionario(f1, 200.0f, 100.0f);
        rh.pagarFuncionario(f2, 210.0f);
        rh.pagarFuncionario(f3, 250.0f, 150.0f, 350.0f);
    }
}
