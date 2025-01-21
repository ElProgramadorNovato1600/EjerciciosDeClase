package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio5 {

    /*Realiza un programa que rellene un array de 6 filas por 10 columnas con
     números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
     continuación, el programa deberá dar la posición tanto del máximo como del
     mínimo.*/

    public static void main(String[] args) {
        int[][] array = new int[6][10];
        Random random = new Random();
        int maximo = 0;
        int minimo = 1000;
        int posicionFila = 0;
        int posicionColumna = 0;

        // Inicializamos el array bidimendional con numeros aleatorios comprendidos entre 0 y 1000 ambos incluidos
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 1000);
            }
        }

        //imprimo el array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(); //Salto de linea

        // Sacamos la poscion del valor mayor
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximo < array[i][j]) {
                    maximo = array[i][j];
                    posicionFila = i;
                    posicionColumna = j;
                }
            }
        }
        //Imprimo valor maximo
        System.out.println("El mayor valor es: " + maximo);
        System.out.println("Fila: " + posicionFila);
        System.out.println("Columna: " + posicionColumna);

        // Sacamos la poscion del valor minimo
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimo > array[i][j]) {
                    minimo = array[i][j];
                    posicionFila = i;
                    posicionColumna = j;
                }
            }
        }
        //Imprimo valor minimo
        System.out.println("El minimo valor es: " + minimo);
        System.out.println("Fila: " + posicionFila);
        System.out.println("Columna: " + posicionColumna);
    }
}