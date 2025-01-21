package org.example;

import java.util.Random;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio4 {

    /*Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un
     pequeño retardo, dando la impresión de que el ordenador se queda "pensando" antes de mostrar los números.*/

    public static void main(String[] args) throws InterruptedException {
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaTotal = 0;
        int[][] array = new int[4][5];
        Random random = new Random();

        //Inicializamos el array con valores aleatorios entre 100 y 999
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100, 999);
            }
        }

        //Mostramos el array con las sumas de las filas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                sumaFilas = sumaFilas + array[i][j];
            }
            Thread.sleep(3000);
            System.out.print("\t\tFila " + i + ": " + sumaFilas);
            sumaFilas = 0;
            System.out.println();
        }
        // Mostramos las suma del contenido de las columnas
        for (int columna = 0; columna < array[0].length; columna++) {
            for (int fila = 0; fila < array.length; fila++) {
                sumaColumnas = sumaColumnas + array[fila][columna];
            }
            Thread.sleep(3000);
            System.out.print("Columna " + columna + ": " + sumaColumnas + "\t");
            sumaColumnas = 0;
        }

        //suma total
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumaTotal = sumaTotal + array[i][j];
            }
        }
        Thread.sleep(3000);
        System.out.print("Suma Total " + sumaTotal);
    }
}