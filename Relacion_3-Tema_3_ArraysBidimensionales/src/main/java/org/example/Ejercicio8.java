package org.example;


import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio8 {

    /*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
     a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
     indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
     64 casillas. Las columnas se indican con las letras de la "a" a la "h" y las filas
     se indican del 1 al 8.*/

    public static void main(String[] args) {

        int[][] tablero = new int[8][8];
        int[] indiceFila = {8, 7, 6, 5, 4, 3, 2, 1};
        char[] indiceColumna = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        final int ALFIL = 1;
        int fila;
        char columna;
        Scanner teclado = new Scanner(System.in);

        //Muestro el tablero vacio
        mostrarTablero(tablero, indiceFila, indiceColumna);

        //Pedimos la posicion inicial del alfil
        System.out.println("Introduce la posicion del alfil en el tablero");
        fila = LeerDatosEntrada.leerEnteroConRango("Introduce la fila", 1, 8);
        fila = posicionFila(indiceFila, fila);
        System.out.println("Introduce la columna a,b,c,d,e,f,g,h");
        columna = teclado.next().charAt(0);

        //obtengo el valor del array char
        columna = (char) posicionColumna(indiceColumna, columna);

        //pongo el alfil en el tablero
        tablero[fila][columna] = ALFIL;

        //Mostramos el tablero con el alfil
        mostrarTablero(tablero, indiceFila, indiceColumna);
        System.out.println("muestro los posibles movimientos");

        //muestro los posibles movimientos
        mostrarPosiblesMovimientos(tablero, fila, columna, indiceColumna);
    }

    public static void mostrarTablero(int[][] tablero, int[] indiceFila, char[] indiceColumna) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(indiceFila[i]);
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("\t" + tablero[i][j] + " ");
            }
            System.out.println();
        }
        for (char c : indiceColumna) {
            System.out.print("\t" + c);
        }
        System.out.println();
    }

    public static void mostrarPosiblesMovimientos(int[][] tablero, int fila, int columna, char[] indiceColumna) {
        mostrarPosibleMovimentoAbajoArriba(tablero, fila, columna, indiceColumna);
        mostrarPosibleMovimentoArribaAbajo(tablero, fila, columna, indiceColumna);
    }


    //Muestra los posibles movimientos de la diagonal que empieza de abajo hacia arriba
    public static void mostrarPosibleMovimentoAbajoArriba(int[][] tablero, int fila, int columna, char[] indiceColumna) {
        int filaPosible = fila;
        int columnaPosible = columna;

        //Movimientos abajo izquierda
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (columnaPosible - 1 >= 0 && filaPosible + 1 <= tablero.length - 1) {
                    columnaPosible--;
                    filaPosible++;
                    System.out.println("F: " + filaPosible + " C: " + valorColumna(indiceColumna, columnaPosible));
                }
            }
        }
        //reseteamos valores
        filaPosible = fila;
        columnaPosible = columna;
        //Movimientos arriba derecha
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (columnaPosible + 1 <= tablero.length - 1 && filaPosible - 1 >= 0) {
                    columnaPosible++;
                    filaPosible--;
                    System.out.println("F: " + filaPosible + " C: " + valorColumna(indiceColumna, columnaPosible));
                }
            }
        }

    }

    //Muestra los posibles movimientos de la diagonal que empieza de arriba hacia abajo
    public static void mostrarPosibleMovimentoArribaAbajo(int[][] tablero, int fila, int columna, char[] indiceColumna) {
        int filaPosible = fila;
        int columnaPosible = columna;

        //Movimientos arriba izquierda
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (columnaPosible - 1 >= 0 && filaPosible - 1 >= 0) {
                    columnaPosible--;
                    filaPosible--;
                    System.out.println("F: " + filaPosible + " C: " + valorColumna(indiceColumna, columnaPosible));
                }
            }
        }
        //reseteamos valores
        filaPosible = fila;
        columnaPosible = columna;
        //Movimientos abajo derecha
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (columnaPosible + 1 <= tablero.length - 1 && filaPosible + 1 <= tablero.length - 1) {
                    columnaPosible++;
                    filaPosible++;
                    System.out.println("F: " + filaPosible + " C: " + valorColumna(indiceColumna, columnaPosible));
                }
            }
        }
    }

    public static int posicionFila(int[] fila, int valorFila) {
        int posicionFila = 0;
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == valorFila) {
                posicionFila = i;
            }
        }
        return posicionFila;
    }

    public static int posicionColumna(char[] columna, char valorColumna) {
        int posicionColumna = 0;
        for (int i = 0; i < columna.length; i++) {
            if (columna[i] == valorColumna) {
                posicionColumna = i;
            }
        }
        return posicionColumna;
    }

    public static char valorColumna(char[] indiceColumna, int posicionColumna) {
        char valor;
        valor = indiceColumna[posicionColumna];
        return valor;
    }
}