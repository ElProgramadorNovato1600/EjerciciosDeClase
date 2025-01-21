package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio2 {

    /*Define un array de 10 caracteres con nombre `simbolo` y asigna valores a los elementos según la tabla que se
    muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los
    elementos que no han sido inicializados?
     Índice	0	1	2	3	4	5	6	7	8	9
     Valor	'a'	'x'		    '@'		'!'	'+'	'Q'
     */

    public static void main(String[] args) {
        char[] simbolo = new char[9];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for (char c : simbolo) {
            System.out.println(c);
        }
        //Por defecto a las posiciones de un array de caracteres (char)
        // Se le asigna el valor de 0
    }
}