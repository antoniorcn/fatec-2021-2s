package edu.curso;

import java.util.Arrays;
import java.util.Collections;

public class GrupoTrabalho<T4> {
    int indice = 0;
    T4[] membros;

    public GrupoTrabalho(T4[] lista) {
        this.membros = lista;
    }

    public void adicionar(T4 f) {
        if (indice < 10) {
            membros[indice] = f;
            indice++;
        }
    }
}
