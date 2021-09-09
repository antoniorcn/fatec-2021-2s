package edu.outropkg;
import edu.curso.Recebedor;
import edu.curso.Coordenador;
import edu.curso.Funcionario;
import edu.curso.FolhaPagamento;

public class TesteEmpresa {
    public static void main(String[] args) {
        Funcionario joao = new Coordenador();
        joao.nivel = 2;

        FolhaPagamento<Recebedor> fp = new FolhaPagamento<>();
    }
}
