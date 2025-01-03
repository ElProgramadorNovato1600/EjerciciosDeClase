/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio8 {
    /*Crea un programa que multiplique dos números enteros de
      la siguiente forma: pedirá al usuario un primer número
      entero. Si el número que se teclee es 0, escribirá en pantalla
      "El producto de 0 por cualquier número es 0". Si se ha
      tecleado un número distinto de cero, se pedirá al usuario un
      segundo número y se mostrará el producto de ambos.
      */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("ingresa un numero");
        numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("El producto de 0 por cualquier número es 0");
        } else {
            System.out.println("ingresa un numero");
            numero2 = teclado.nextInt();
            System.out.println("resultado " + (numero * numero2));
        }
    }
}
