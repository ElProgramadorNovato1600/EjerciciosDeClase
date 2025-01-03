/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio16 {

    /*Crea un programa que pida al usuario dos números enteros y diga si uno y sólo uno es par.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();


        if (numero % 2 == 0) {
            System.out.println("Es par " + numero);
        } else if (numero2 % 2 == 0) {
            System.out.println("Es par " + numero2);
        } else {
            System.out.println("Ninguno es par");
        }
    }
}
