package org.example;

import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio10 {

    /*Realiza el juego del 3 en raya*/

    public static void main(String[] args) {

        char[][] tablero = new char[3][3];
        Scanner teclado = new Scanner(System.in);
        String jugador1;
        String jugador2;
        int fila;
        int columna;
        boolean ganador;
        boolean juegoTerminado;


        //Relleno el tablero de espacios en blanco
        rellenarTablero(tablero);


        System.out.println("\tBienvenidos juagadores al tres en raya");
        System.out.println("Jugador 1 Ficha X");
        System.out.println("Jugador 2 Ficha 0");
        System.out.println("Jugador 1 introduce tu nombre");
        jugador1 = teclado.nextLine();
        System.out.println("Jugador 2 introduce tu nombre");
        jugador2 = teclado.nextLine();

        do {
            //compruebo que se puede colocar ficha
            do {
                System.out.println("Turno Jugador 1 " + jugador1);
                fila = LeerDatosEntrada.leerEnteroConRango("Introduce la fila: ", 0, tablero.length - 1);
                columna = LeerDatosEntrada.leerEnteroConRango("Introduce la columna: ", 0, tablero.length - 1);
            } while (comprobarCelda(tablero, fila, columna));
            colocarFichaX(tablero, fila, columna);

            //muestro tablero
            //comrpuebo si ha ganado un jugador
            mostrarTablero(tablero);
            ganador = comprobarGanador(tablero);
            juegoTerminado = juegoTerminado(tablero);
            if (!ganador) {
                if (!juegoTerminado) {
                    do {

                        //compruebo que se puede colocar ficha
                        System.out.println("Turno Jugador 2 " + jugador2);
                        fila = LeerDatosEntrada.leerEnteroConRango("Introduce la fila: ", 0, tablero.length - 1);
                        columna = LeerDatosEntrada.leerEnteroConRango("Introduce la columna: ", 0, tablero.length - 1);
                    } while (comprobarCelda(tablero, fila, columna));
                    colocarFichaY(tablero, fila, columna);

                    //muestro tablero
                    //comrpuebo si ha ganado el jugador o si ya no hay mas posibles turnos
                    mostrarTablero(tablero);
                    ganador = comprobarGanador(tablero);
                    juegoTerminado = juegoTerminado(tablero);
                    if (ganador) {
                        System.out.println("HAS GANADAO JUGADOR " + jugador2);
                    }
                }
            } else {
                System.out.println("HAS GANADAO JUGADOR " + jugador1);
            }
        } while (!ganador && !juegoTerminado);
        System.out.println("Juego terminado");
    }

    public static void rellenarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    //Muestra el tablero
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println("\t-------------------");
            for (int j = 0; j < tablero.length; j++) {
                System.out.print("\t" + tablero[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void colocarFichaX(char[][] tablero, int fila, int columna) {
        char fichaX = 'X';
        tablero[fila][columna] = fichaX;
    }

    public static void colocarFichaY(char[][] tablero, int fila, int columna) {
        char fichaY = 'Y';
        tablero[fila][columna] = fichaY;
    }

    //Comprueba que la celda o casilla no este ocupada si lo esta delvuelve true;
    public static boolean comprobarCelda(char[][] tablero, int fila, int columna) {
        boolean celdaOcupada;
        return celdaOcupada = tablero[fila][columna] != ' ';
    }

    //Comprueba si un jugador ha ganado
    public static boolean comprobarGanador(char[][] tablero) {
        return tresEnRayaHorizontal(tablero)
                || tresEnRayaVertical(tablero)
                || tresEnRayaDiagonal(tablero);
    }

    public static boolean juegoTerminado(char[][] tablero) {
        boolean juegoTerminado = true;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length && juegoTerminado; j++) {
                if (tablero[i][j] == ' ') { // si hay casillas vacias el juego no terminara
                    juegoTerminado = false;
                    break;
                }
            }
        }

        return juegoTerminado;
    }

    public static boolean tresEnRayaHorizontal(char[][] tablero) {
        boolean ganador = false;
        for (int i = 0; i < tablero.length; i++) {
            ganador = (tablero[i][0] == tablero[i][1]
                    && tablero[i][1] == tablero[i][2]
                    && tablero[i][0] != ' '); // se comprueba que no se comparen celdas vacias
        }
        return ganador;
    }

    private static boolean tresEnRayaVertical(char[][] tablero) {
        boolean ganador = false;
        for (int i = 0; i < tablero.length && !ganador; i++) {
            ganador = (tablero[0][i] == tablero[1][i]
                    && tablero[1][i] == tablero[2][i]
                    && tablero[0][i] != ' '); // se comprueba que no se comparen celdas vacias
        }
        return ganador;
    }

    private static boolean tresEnRayaDiagonal(char[][] tablero) {
        boolean ganador = false;

        //Diagonal izquierda-derecha
        int posicion = tablero[0][0];
        if (posicion != ' ') {
            ganador = true;
            for (int i = 1; i < tablero.length; i++) {
                if (posicion != tablero[i][i]) {
                    ganador = false;
                    break;
                }
            }
        }

        //Diagonal derecha-izquierda

        posicion = tablero[0][2];
        if (!ganador && posicion != ' ') {
            ganador = true;
            for (int i = 1, j = 1; i < tablero.length; i++, j--) {
                if (posicion != tablero[i][j]) {
                    ganador = false;
                    break;
                }
            }
        }
        return ganador;
    }
}