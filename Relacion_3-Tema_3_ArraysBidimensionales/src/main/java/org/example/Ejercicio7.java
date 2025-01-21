package org.example;

import org.ValidarDatos.src.ValidarDatos.LeerDatosEntrada;
import java.util.Random;

/*
* @author Antonio Espínola Ramírez
* */

public class Ejercicio7 {

    /*Mejora el juego "Busca el tesoro" de tal forma que si hay una mina a una casilla
     de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!*/

    public static void main(String[] args) {

        int[][] tablero = new int[5][5];
        Random random = new Random();
        final int BOMBA = 2;
        final int TESORO = 3;
        int fila;
        int columna;
        boolean hasGanado = false;
        boolean hasPerdido = false;
        boolean tesoroColocado = false;

        // colocamos aleatoriamente en el tablero 5 bombas
        for (int i = 0; i <= 5; i++) {
            fila = random.nextInt(0, tablero.length - 1);
            columna = random.nextInt(0, tablero.length - 1);
            tablero[fila][columna] = BOMBA;
        }

        //colocamos aleatoriamente el tesoro comprobando que ninguna casilla este ocupada
        do {
            for (int i = 0; i < 1; i++) {
                fila = random.nextInt(0, tablero.length - 1);
                columna = random.nextInt(0, tablero.length - 1);
                if (!casillaOcupada(tablero, fila, columna)) {
                    tablero[fila][columna] = TESORO;
                    tesoroColocado = true;
                }
            }
        } while (!tesoroColocado);

        System.out.print("\t\t Bienvenido al Juego Del Tesoro");
        System.out.println("El tablero es de 5x5");

        do {
            fila = LeerDatosEntrada.leerEnteroConRango("Introduce la posicion Fila ", 0, 4); //Rango 0-4
            columna = LeerDatosEntrada.leerEnteroConRango("Introduce la posicion columna ", 0, 4); //Rango 0-4
            switch (tablero[fila][columna]) {
                case 0:
                    System.out.println("No hay nada en esta casilla");
                    System.out.println("Alrededor de esta casilla se encuentran " + comprobarBomba(tablero, fila, columna, BOMBA) + " bombas");
                    break;
                case 2:
                    System.out.println("BOMBAAAAAAA");
                    System.out.println("Has Perdido....");
                    mostrarTablero(tablero);
                    hasPerdido = true;
                    break;
                case 3:
                    System.out.println("Has encontrado el tesoro");
                    mostrarTablero(tablero);
                    hasGanado = true;
            }
        } while (!hasGanado || hasPerdido);
    }

    //Funcion que devuelve true si hay alguna casilla ocupada en el tablero
    //Por defecto las celdas vacias tendran como valor 0
    public static boolean casillaOcupada(int[][] tablero, int fila, int columna) {
        boolean casillaOcupada = false;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[fila][columna] != 0) { //Si es distinta de 0 la casilla esta ocupada
                    casillaOcupada = true;
                    break;
                }
            }
        }
        return casillaOcupada;
    }

    public static void mostrarTablero(int[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int comprobarBomba(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        numBombas = comprobarBombaAbajo(tablero, fila, columna, bomba) + comprobarBombaArriba(tablero, fila, columna, bomba) + comprobarBombaDerecha(tablero, fila, columna, bomba) + comprobarBombaIzquierda(tablero, fila, columna, bomba) + comprobarBombaDiagonalArribaAbajo(tablero, fila, columna, bomba) + comprobarBombaDiagonalAbajoArriba(tablero, fila, columna, bomba);

        return numBombas;
    }

    public static int comprobarBombaAbajo(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (fila + 1 <= tablero.length - 1) { //compruebo que no supere el rango del tablero
            if (tablero[fila + 1][columna] == bomba) {
                numBombas = 1;
            }
        }
        return numBombas;
    }

    public static int comprobarBombaArriba(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (fila - 1 >= 0) { //compruebo que no supere el rango del tablero
            if (tablero[fila - 1][columna] == bomba) {
                numBombas = 1;
            }
        }
        return numBombas;
    }

    public static int comprobarBombaDerecha(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (columna + 1 <= tablero.length - 1) { //compruebo que no supere el rango del tablero
            if (tablero[fila][columna + 1] == bomba) {
                numBombas = 1;
            }
        }
        return numBombas;
    }

    public static int comprobarBombaIzquierda(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (columna - 1 >= 0) { //compruebo que no supere el rango del tablero
            if (tablero[fila][columna - 1] == bomba) {
                numBombas = 1;
            }
        }
        return numBombas;
    }

    public static int comprobarBombaDiagonalArribaAbajo(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (columna + 1 <= tablero.length - 1 && fila + 1 <= tablero.length - 1) { //compruebo que no supere el rango del tablero
            if (tablero[fila + 1][columna + 1] == bomba) {
                numBombas = 1;
            }
        }
        if (columna - 1 >= 0 && fila - 1 >= 0) { //compruebo que no supere el rango del tablero
            if (tablero[fila - 1][columna - 1] == bomba) {
                numBombas++;
            }
        }
        return numBombas;
    }

    public static int comprobarBombaDiagonalAbajoArriba(int[][] tablero, int fila, int columna, int bomba) {
        int numBombas = 0;
        if (columna + 1 <= tablero.length - 1 && fila - 1 >= 0) { //compruebo que no supere el rango del tablero
            if (tablero[fila - 1][columna + 1] == bomba) {
                numBombas = 1;
            }
        }
        if (columna - 1 >= 0 && fila + 1 <= tablero.length - 1) { //compruebo que no supere el rango del tablero
            if (tablero[fila + 1][columna - 1] == bomba) {
                numBombas++;
            }
        }
        return numBombas;
    }
}