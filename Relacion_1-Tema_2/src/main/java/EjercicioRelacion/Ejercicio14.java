/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio14 {

    /*Crea un programa que pida al usuario dos números enteros y
      diga si ambos son pares.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();


        if (numero % 2 == 0 && numero2 % 2 == 0) {
            System.out.println("Son pares");
        } else {
            System.out.println("uno de los dos o los dos no son pares");
        }
    }
}
