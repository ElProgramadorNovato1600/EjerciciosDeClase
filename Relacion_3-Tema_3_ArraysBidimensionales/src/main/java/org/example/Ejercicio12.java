package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio12 {

    /*Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números aleatorios
    entre 500 y 900. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquina
    inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo y la media de los números que hay en
    esa diagonal.
     */

    public static void main(String[] args) {
        int[][] matriz = new int[9][9];
        Random random = new Random();
        int fila = 8;
        int columna = 0;
        int maximo;
        int minimo;
        int contador = 0;
        int suma = 0;
        int media;


        // rellenamos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(500, 900);
            }
        }

        //mostramos la matriz original
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }


        //Muestro los numeros de la diagonal inferior izquierda - derecha superior
        //obtengo el mayor y el menor de los numeros
        //obtengo la media de todos los numero de la diagonal
        System.out.println("numeros de la diagonal inferior izquierda - derecha superior");

        System.out.print(matriz[8][0] + "\t");
        maximo = matriz[8][0];
        minimo = matriz[8][0];
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = 0; j < matriz.length; j++) {
                if (fila - 1 >= 0 && columna + 1 <= matriz.length - 1) {
                    fila--;
                    columna++;
                    System.out.print(matriz[fila][columna] + "\t");
                    contador++;
                    suma = suma + matriz[fila][columna];
                    if (maximo < matriz[fila][columna]) {
                        maximo = matriz[fila][columna];
                    }
                    if (minimo > matriz[fila][columna]) {
                        minimo = matriz[fila][columna];
                    }
                }
            }
        }
        media = suma / contador;
        System.out.println();
        System.out.println("La suma total de los numeros es " + suma);
        System.out.println("Media " + media);
        System.out.println("Numero maximo " + maximo);
        System.out.println("Numero minimo " + minimo);
    }
}