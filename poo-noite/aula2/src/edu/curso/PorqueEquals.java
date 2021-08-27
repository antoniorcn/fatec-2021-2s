package edu.curso;

import java.util.Scanner;

public class PorqueEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "JOAO";
        String b = "Joao";

        a = scan.nextLine();
        b = scan.nextLine();

        System.out.println( a.hashCode() );
        System.out.println( b.hashCode() );

        if (a.toUpperCase().hashCode() == b.toUpperCase().hashCode()) {
        // if (a.hashCode() == b.hashCode()) {
        // if (a.equals(b)) {
        // if (a == b) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
