/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio9 {

    /*Crea un programa que pida al usuario dos números enteros.
      Si el segundo no es cero, mostrará el resultado de dividir
      entre el primero y el segundo. Por el contrario, si el segundo
      número es cero, escribirá "Error: No se puede dividir entre
      cero".*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();

        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre cero");
        } else {
            System.out.println("Resultado: " + (numero / numero2));
        }
    }
}
