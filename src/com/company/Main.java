package com.company;

import java.util.Scanner;

public class Main {
    static int acumuladorNumeroFibonacci = 1;
    public static void sumarNumerosFibonacci(int numerosASumarFibonacci){
        int numeroFibonacci = 0;
        int numeroFibonacciAnterior = 0;
        int numeroFibonacciGuardado = 1;
        System.out.println(1);
        for (int i = 1; i < numerosASumarFibonacci; i++) {
                numeroFibonacci = numeroFibonacciGuardado + numeroFibonacciAnterior;
                numeroFibonacciAnterior = numeroFibonacciGuardado;
                numeroFibonacciGuardado = numeroFibonacci;
                acumuladorNumeroFibonacci += numeroFibonacci;
                System.out.println(numeroFibonacci);
        }
    }

    public static void main(String[] args) {

        int numerosASumarDelFibonacci;
        Scanner reader = new Scanner(System.in);
        numerosASumarDelFibonacci = reader.nextInt();
        sumarNumerosFibonacci(numerosASumarDelFibonacci);
        System.out.println("Suma de los numeros de la secuencia: " + acumuladorNumeroFibonacci);

    }
}
