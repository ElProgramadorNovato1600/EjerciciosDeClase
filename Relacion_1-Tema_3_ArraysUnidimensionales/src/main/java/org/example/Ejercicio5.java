package org.example;

import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio5 {

    /*Escribe un programa que pida 10 números por teclado y que luego muestre los
     números introducidos junto con las palabras "máximo" y "mínimo" al lado del
     máximo y del mínimo respectivamente.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] num = new int[10];

        int maximo = Integer.MIN_VALUE; // valor minimo
        int posicionMaximo = -1; // -1 por si da error se salga del array

        int minimo = Integer.MAX_VALUE; // valor maximo
        int posicionMinimo = -1; // -1 por si da error se salga del array

        //Asigno valores al array por teclado
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa un numero");
            num[i] = teclado.nextInt();
        }

        //Obtengo las posiciones del valor minimo y maximo
        for (int i = 0; i < num.length; i++) {
            if (num[i] < minimo) {
                minimo = num[i];
                posicionMinimo = i;
            }
            if (num[i] > maximo) {
                maximo = num[i];
                posicionMaximo = i;
            }
        }
        //Imprimo el array
        for (int i = 0; i < num.length; i++) {
            if (i != posicionMaximo && i != posicionMinimo) {
                System.out.println(num[i]);
            }
            if (i == posicionMaximo) {
                System.out.println("MAXIMO " + num[i]);
            }
            if (i == posicionMinimo) {
                System.out.println("MINIMO " + num[i]);
            }
        }
    }
}
