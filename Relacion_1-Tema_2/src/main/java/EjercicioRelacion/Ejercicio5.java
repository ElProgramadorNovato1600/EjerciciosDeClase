/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio5 {

    /*Crea un programa que pida al usuario dos números enteros y
      diga cuál es el mayor de ellos.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("ingresa un numero");
        numero2 = teclado.nextInt();

        if (numero > numero2) {
            System.out.println(numero + " es mayor que " + numero2);
        } else {
            System.out.println(numero2 + " es mayor que " + numero);
        }
    }
}
