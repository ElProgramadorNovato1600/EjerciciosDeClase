/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio19 {

    /*Crea un programa que pida al usuario dos números enteros y
      diga si son iguales o, en caso contrario, cuál es el mayor de
      ellos.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();

        if (numero == numero2) {
            System.out.println("Los dos numeros son iguales");
        } else if (numero > numero2) {
            System.out.println("El numero " + numero + " es mayor que " + numero2);
        } else {
            System.out.println("El numero " + numero2 + " es mayor que " + numero);
        }
    }
}
