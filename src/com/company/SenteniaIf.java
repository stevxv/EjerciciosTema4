package com.company;

public class SenteniaIf {
    public static void main(String[] args) {

        int numeroIf;

        numeroIf = -1;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " -> El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " -> El numero es negativo");
        } else {
            System.out.println(numeroIf + " -> El numero es cero");
        }

        numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " -> El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " -> El numero es negativo");
        } else {
            System.out.println(numeroIf + " -> El numero es cero");
        }

        numeroIf = 1;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " -> El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " -> El numero es negativo");
        } else {
            System.out.println(numeroIf + " -> El numero es cero");
        }
    }
}
