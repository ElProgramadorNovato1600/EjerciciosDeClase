package org.example;

import java.util.Scanner;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio9 {

    /*Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra "par" o
    "impar" según proceda.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arrayNumeros = new int[8];

        //Pido los numeros por teclado
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Ingresa un numero");
            arrayNumeros[i] = teclado.nextInt();
        }

        //muestro el array con par e impar
        for (int arrayNumero : arrayNumeros) {
            if (arrayNumero % 2 == 0) {
                System.out.println("Par " + arrayNumero);
            } else {
                System.out.println("Impar " + arrayNumero);
            }
        }
    }
}