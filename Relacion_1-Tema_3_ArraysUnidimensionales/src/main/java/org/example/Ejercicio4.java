package org.example;

import java.util.Random;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio4 {

    /*Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con
    valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el
    array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. A continuación,
    muestra el contenido de los tres arrays dispuesto en tres columnas.*/

    public static void main(String[] args) {
        //creamos un objeto Random
        Random random = new Random();

        //Creamos los array
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];


        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(0, 100); //Numero aleatorio entre 0 y 100
            System.out.print("numero " + numero[i]);
            cuadrado[i] = numero[i] * numero[i]; //Numero al cuadrado
            System.out.print(" cuadrado " + cuadrado[i]);
            cubo[i] = numero[i] * numero[i] * numero[i]; //Numero al cubo
            System.out.println(" cubo " + cubo[i] + " \n");
        }
    }
}