package edu.curso;

public abstract class Pizza {
    public abstract void preparar();
    public abstract void assar();
    public abstract void servir();

    public void embalar() {
        System.out.println("Colocando a pizza na caixa de papelao");
    }
}
