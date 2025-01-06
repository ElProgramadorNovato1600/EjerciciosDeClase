/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Random;
import java.util.Scanner;

/**
 *
* @author Antonio Espinola Ramirez
 */
public class Ejercicio7 {

    /*Realiza el "juego de la suma", que consiste en que aparezcan dos números aleatorios
     (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar si
     el resultado de la operación es correcto o incorrecto.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random(System.currentTimeMillis());
        int aletorio = numAleatorio.nextInt(100);
        int aletorio2 = numAleatorio.nextInt(100);
        int suma;
        int resultadoReal;

        System.out.println("El primer numero " + aletorio);
        System.out.println("El segundo numero " + aletorio2);

        System.out.println("calcula la suma");
        suma = teclado.nextInt();

        resultadoReal = aletorio + aletorio2;

        if (suma == resultadoReal) {
            System.out.println("El resultado es correcto " + suma);
        } else {
            System.out.println("El resultado es incorrecto");
        }
    }
}
