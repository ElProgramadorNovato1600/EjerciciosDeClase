/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio24 {

    /*Escribe un programa que lea un número n e imprima una pirámide de números
      con n filas como en la siguiente figura:*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println("Ingresa el número de filas para la pirámide:");
        altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= (altura - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
