package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */
public class Ejercicio1 {
    /*Define un array de 12 números enteros con nombre `num` y asigna los valores
     según la tabla que se muestra a continuación. Muestra el contenido de todos
     los elementos del array. ¿Qué sucede con los valores de los elementos que no
     han sido inicializados?
     Índice	0	1	2	3	4	5	6	7	8	9	10	11
     Valor	39	-2		    0	    14	    5	120
     */

    public static void main(String[] args) {
        int[] num = new int[11];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        for (int j : num) {
            System.out.println(j);
        }
        //Por defecto a las posiciones de un array de enteros (int)
        // Se le asigna el valor de 0
    }
}