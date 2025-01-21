package org.example;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio7 {

    /*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por
    espacios. El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del
    primer valor por el segundo en la lista generada anteriormente. Los números que se han cambiado deben aparecer
    entrecomillados.*/

    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        int[] arrayNumeros = new int[100];

        //Inicializo el array con 100 numeros aleatorios entre 0 y 20
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = random.nextInt(0, 20);
        }
        //muestro el array sin modificar
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }

        System.out.println(); //Salto de linea
        System.out.println("Ingresa un numero que quieres remplazar");
        numero = teclado.nextInt();
        System.out.println("Ingresa el numero remplazante");
        numero2 = teclado.nextInt();
        System.out.println(); //Salto de linea
        System.out.println("Sustituyo el numero " + numero + " por el numero " + numero2);

        //Sustituyo un numero por otro en el array
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] == numero) {
                arrayNumeros[i] = numero2;
            }
        }
        //Muestro el array modificado
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }
    }
}
