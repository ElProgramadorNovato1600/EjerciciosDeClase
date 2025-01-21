package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio13 {

    /*Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países.
     El array que contiene los nombres de los países es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
     Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios
     generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países se
     deben mostrar utilizando el array de países (no se pueden escribir directamente).
     */

    public static void main(String[] args) {
        int media = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int contador = 0;
        int[] mediaFila = new int[4];
        int[] maximoFila = new int[4];
        int[] minimoFila = new int[4];
        String[] pais = {"España", "Rusia", "Japon", "Australia"};
        String[] resultado = {"MED", "MIN", "MAX"};
        int[][] array = new int[4][10];
        Random random = new Random();


        //Inicializamos el array con numeros aleatorios entre 140 y 210
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(140, 210);
            }
            System.out.println();
        }
        //Mostramos por pantalla los resultados
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        for (String s : resultado) {
            System.out.print(s + "\t");
        }
        //obtengo la media de cada fila y lo almaceno en un array independiente
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                contador++;
                media = media + array[i][j];
            }
            media = media / contador;
            contador = 0;
            mediaFila[i] = media;
        }

        //obtengo el minimo y maximo de cada fila y lo almaceno en dos array independientes
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximo < array[i][j]) {
                    maximo = array[i][j];
                }
                if (minimo > array[i][j]) {
                    minimo = array[i][j];
                }
            }
            maximoFila[i] = maximo;
            minimoFila[i] = minimo;
            maximo = Integer.MIN_VALUE;
            minimo = Integer.MAX_VALUE;
        }

        System.out.println();
        //Muestro por pantalla el resultado
        for (int i = 0; i < array.length; i++) {
            System.out.print(pais[i] + ":\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (j == array[i].length - 1) {
                    System.out.print("|");
                    System.out.print("\t" + mediaFila[i]);
                    System.out.print("\t" + minimoFila[i]);
                    System.out.print("\t" + maximoFila[i]);
                }
            }
            System.out.println();
        }
    }
}