package org.example;

import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio6 {

    /*Escribe un programa que lea 15 números por teclado y que los almacene en un
     array. Rota los elementos de ese array, es decir, el elemento de la posición 0
     debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
     la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
     del array.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[15];
        int guardoUltimoValor;

        //Asigno 15 numeros al array por teclado
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingresa un numero");
            num[i] = teclado.nextInt();
        }

        guardoUltimoValor = num[num.length - 1]; //Guardo el ultimo valor del array

        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = guardoUltimoValor;

        for (int j : num) {
            System.out.print(j + " ");
        }
    }
}