package edu.curso;

public class ComparacaoStrings {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";

        System.out.println(b.hashCode());

        if (a == b) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
