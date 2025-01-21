package org.example;

import java.util.Scanner;
/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio3 {

    /*Escribe un programa que lea 10 números por teclado y que luego los muestre
     en orden inverso, es decir, el primero que se introduce es el último en mostrarse
     y viceversa.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];

        //Introducimos los numeros por teclado
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingresa un numero");
            num[i] = teclado.nextInt();
        }

        //Recorremos y mostramos el array de forma inversa
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
