/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio3 {

    /*Crea un programa que convierta de grados Celsius
     (centígrados) a Kelvin y a Fahrenheit: pedirá al usuario la
     cantidad de grados centígrados y usará las siguiente tablas
     de conversión: kelvin = celsius + 273 ; fahrenheit = celsius x
     18 / 10 + 32.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int grados;

        System.out.println("inserte grados celsius:");
        grados = teclado.nextInt();

        System.out.println("Grados celsius: " + grados);
        System.out.println("kelvin: " + (grados + 273));
        System.out.println("Fahrenheit: " + (grados * 18 / 10 + 32));
    }

}
