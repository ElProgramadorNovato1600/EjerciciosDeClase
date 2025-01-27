/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio11 {

    /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
      los 5 primeros números enteros a partir de uno que se introduce por teclado.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int actual;
        int cuadrado;
        int cubo;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        for (int i = 0; i < 5; i++) {
            actual = numero + i;
            cuadrado = actual * actual;
            cubo = actual * actual * actual;
            System.out.println("numero " + actual + " cuadrado " + cuadrado + " cubo " + cubo);
        }
    }
}
