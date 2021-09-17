package edu.curso;

public class Ponto {
    public static double PI = 3.14159;
    public double x;
    public double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanciaX() {
        double resultado = 0;
        synchronized (this) {
            Math.abs(this.x);
        }
        int a = desenhaPonto2D(this.x, this.y);
        return resultado;
    }

    public static double multiplicador(double v1, double v2) {
        return v1 * v2;
    }

    native int desenhaPonto2D(double x, double y);
}
