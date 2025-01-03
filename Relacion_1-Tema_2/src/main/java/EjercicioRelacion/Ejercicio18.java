/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 *
* @author Antonio Espinola Ramirez
 */
public class Ejercicio18 {

    /*Crea un programa que pida al usuario tres números y
      muestre cuál es el mayor de los tres.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        int numero3;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero3 = teclado.nextInt();

        if (numero > numero2 && numero2 > numero3) {
            System.out.println("orden: ");
            System.out.println(numero);
            System.out.println(numero2);
            System.out.println(numero3);
        } else if (numero > numero3 && numero3 > numero2) {
            System.out.println("orden: ");
            System.out.println(numero);
            System.out.println(numero3);
            System.out.println(numero2);
        } else if (numero2 > numero && numero > numero3) {
            System.out.println("orden: ");
            System.out.println(numero2);
            System.out.println(numero);
            System.out.println(numero3);
        } else if (numero2 > numero3 && numero3 > numero) {
            System.out.println("orden: ");
            System.out.println(numero2);
            System.out.println(numero3);
            System.out.println(numero);
        } else if (numero3 > numero && numero > numero2) {
            System.out.println("orden: ");
            System.out.println(numero3);
            System.out.println(numero);
            System.out.println(numero2);
        } else if (numero3 > numero2 && numero2 > numero) {
            System.out.println("orden: ");
            System.out.println(numero3);
            System.out.println(numero2);
            System.out.println(numero);
        }
    }
}
