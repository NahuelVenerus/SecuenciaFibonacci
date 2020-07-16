package com.company;

import java.util.Scanner;

public class Main {
    static int numeroFibonacci = 0;
    static int acumuladorNumeroFibonacci = 1;
    public static void sumarNumerosFibonacci(int vueltasFor){
        int numeroFibonacciAnterior = 0;
        int numeroFibonacciGuardado = 1;
        for (int i = 0; i < vueltasFor; i++) {
            if (i == 0) {
                numeroFibonacci = 1;
                System.out.println(numeroFibonacci);
            } else {
                numeroFibonacci = numeroFibonacciGuardado + numeroFibonacciAnterior;
                numeroFibonacciAnterior = numeroFibonacciGuardado;
                numeroFibonacciGuardado = numeroFibonacci;
                acumuladorNumeroFibonacci += numeroFibonacci;
                System.out.println(numeroFibonacci);
            }
        }
    }

    public static void main(String[] args) {

        int numerosASumarDelFibonacci;
        Scanner reader = new Scanner(System.in);
        numerosASumarDelFibonacci = reader.nextInt();
        sumarNumerosFibonacci(numerosASumarDelFibonacci);
        System.out.println("Numero Fibonacci: " + acumuladorNumeroFibonacci);

    }
}
