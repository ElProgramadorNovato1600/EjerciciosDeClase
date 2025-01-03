/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio11 {

    /*Crea un programa que pida al usuario un número entero y
      responda si es múltiplo de 2 y de 3 simultáneamente.
      */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Es multiplo de 2 y 3");
        } else {
            System.out.println("No es multiplo");
        }
    }
}
