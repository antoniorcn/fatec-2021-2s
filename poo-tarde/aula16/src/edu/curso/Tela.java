package edu.curso;

import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public abstract class Tela {
    private List<ExecutorComandos> listaExecutores = new ArrayList<>();

    public abstract Pane render();

    public void adicionarExecutor(ExecutorComandos exec) {
        listaExecutores.add(exec);
    }

    public void removerExecutor(ExecutorComandos exec) {
        listaExecutores.remove(exec);
    }

    public void notificarComando(String comando) {
        for (ExecutorComandos exec : listaExecutores) {
            exec.executarComando(comando);
        }
    }
}
