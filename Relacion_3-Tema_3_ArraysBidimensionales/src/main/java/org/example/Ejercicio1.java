package org.example;

/*
 * @author Antonio Espínola
 * */

public class Ejercicio1 {

    /*Define un array de números enteros de 3 filas por 6 columnas con nombre num
     y asigna los valores según la siguiente tabla. Muestra el contenido de todos
     los elementos del array dispuestos en forma de tabla como se muestra en la
     figura.

     Array num Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5
     Fila 0 	0	        30         2       	                    5
     Fila 1 	75      	                              0
     Fila 2 		                   -2	      9 	            11
     */

    public static void main(String[] args) {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][1] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}