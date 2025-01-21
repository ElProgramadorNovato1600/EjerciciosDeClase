package org.example;

import java.util.Scanner;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio2 {

    /*Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5
    columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se
    tratara. La suma total debe aparecer en la esquina inferior derecha.*/

    public static void main(String[] args) {
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaTotal = 0;
        int[][] array = new int[4][5];
        Scanner teclado = new Scanner(System.in);

        //Inicializamos el array por teclado
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un numero");
                array[i][j] = teclado.nextInt();
            }
        }

        //Mostramos el array con las sumas de las filas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                sumaFilas = sumaFilas + array[i][j];
            }
            System.out.print("\t\tFila " + i + ": " + sumaFilas);
            sumaFilas =0;
            System.out.println();
        }

        // Mostramos las suma del contenido de las columnas
        for (int columna = 0; columna < array[0].length; columna++) {
            for (int fila = 0; fila < array.length; fila++) {
                sumaColumnas = sumaColumnas + array[fila][columna];
            }
            System.out.print("Columna " + columna + ": " + sumaColumnas + "\t");
            sumaColumnas = 0;
        }

        //suma total
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumaTotal = sumaTotal + array[i][j];
            }
        }
        System.out.print("Suma Total " + sumaTotal);
    }
}