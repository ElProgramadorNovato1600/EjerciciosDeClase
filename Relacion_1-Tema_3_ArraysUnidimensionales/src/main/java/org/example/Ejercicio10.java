package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio10 {

    /*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
     y que los almacene en un array. El programa debe ser capaz de pasar todos
     los números pares a las primeras posiciones del array (del 0 en adelante) y
     todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
     necesario.*/

    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayNumeros = new int[20];
        int[] arrayPares = new int[20];
        int[] arrayImpares = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        //relleno el array con numeros aleatorios comprendidos entre 0-100
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = random.nextInt(0, 100);
        }
        //Mostramos por pantalla el array original
        System.out.println("Array Original");
        for (int arrayNumero : arrayNumeros) {
            System.out.print(arrayNumero + " ");
        }

        // separamos los pares de los impares en diferentes arrays
        for (int arrayNumero : arrayNumeros) {
            if (arrayNumero % 2 == 0) {
                arrayPares[contadorPar] = arrayNumero;
                contadorPar++;
            } else {
                arrayImpares[contadorImpar] = arrayNumero;
                contadorImpar++;
            }
        }

        //Nota: En este tema no se pueden usar funciones
        //Aqui pondría una función para no repetir codigo

        // Metodo buble sort Ordena los numeros pares
        for (int i = 0; i < contadorPar - 1; i++) {
            for (int j = 0; j < contadorPar - 1 - i; j++) {
                if (arrayPares[j] > arrayPares[j + 1]) {
                    int temp = arrayPares[j];
                    arrayPares[j] = arrayPares[j + 1];
                    arrayPares[j + 1] = temp;
                }
            }
        }
        // Metodo buble sort Ordena los numeros impares
        for (int i = 0; i < contadorImpar - 1; i++) {
            for (int j = 0; j < contadorImpar - 1 - i; j++) {
                if (arrayImpares[j] > arrayImpares[j + 1]) {
                    int temp = arrayImpares[j];
                    arrayImpares[j] = arrayImpares[j + 1];
                    arrayImpares[j + 1] = temp;
                }
            }
        }

        //introduzco los pares en el array
        for (int i = 0; i < contadorPar; i++) {
            arrayNumeros[i] = arrayPares[i];
        }
        //introduzco los impares en el array
        for (int i = 0; i < contadorImpar; i++) {
            arrayNumeros[contadorPar + i] = arrayImpares[i];
        }
        //muestro el array ordenado y separado por pares e impares
        System.out.println();
        System.out.println("Array Ordenado");
        for (int arrayNumero : arrayNumeros) {
            System.out.print(arrayNumero + " ");
        }
    }
}
