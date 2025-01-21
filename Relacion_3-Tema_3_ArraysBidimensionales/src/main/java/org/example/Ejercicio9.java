package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio9 {

    /*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
     cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
     12 filas por 12 columnas y debe contener números generados al azar entre 0 y
     100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
     con los números convenientemente alineados.*/

    public static void main(String[] args) {
        int[][] matriz = new int[12][12];
        Random random = new Random();

        // inicializamos la matriz entre 0 y 100
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(0, 100);
            }
        }

        // Mostramos la matriz original
        mostarMatriz(matriz);

        //Mostramos la matriz modificada
        //mostarMatriz(matriz);
        System.out.println();
        System.out.println();

        mostarMatriz(reloj(matriz));
    }

    public static void mostarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static int[][] reloj(int[][] matriz) {
        int[][] matrizNueva = new int[12][12];
        int ultimaPosicion = 11; //  ultima posicion
        int primeraPosicion = 0; // primera posicion
        int rotacion = 1;

        while (rotacion > 0) {
            int inicio = primeraPosicion; // inicio anillo actual
            int fin = ultimaPosicion;     // Límite del anillo actual

            // rotacion por anillo (del externo al interior)
            for (int r = 0; r < 7; r++) { // el 7 son los anillos que hay en total
                // Mover fila superior hacia la derecha
                for (int j = fin; j > inicio; j--) {
                    matrizNueva[inicio][j] = matriz[inicio][j - 1];
                }

                // Mover columna derecha hacia abajo
                for (int i = fin; i > inicio; i--) {
                    matrizNueva[i][fin] = matriz[i - 1][fin];
                }

                // Mover fila inferior hacia la izquierda
                for (int j = inicio; j < fin; j++) {
                    matrizNueva[fin][j] = matriz[fin][j + 1];
                }

                // Mover columna izquierda hacia arriba
                for (int i = inicio; i < fin; i++) {
                    matrizNueva[i][inicio] = matriz[i + 1][inicio];
                }
                inicio++;
                fin--;
            }
            // Disminuir las rotaciones restantes
            rotacion--;
            ultimaPosicion--;
            primeraPosicion++;
        }
        return matrizNueva;
    }
}