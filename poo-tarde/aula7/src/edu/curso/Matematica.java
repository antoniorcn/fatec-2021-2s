package edu.curso;

public class Matematica<T extends Number> {

    public Double somar(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

//    public double somar(double n1, double n2) {
//        return n1 + n2;
//    }
}
