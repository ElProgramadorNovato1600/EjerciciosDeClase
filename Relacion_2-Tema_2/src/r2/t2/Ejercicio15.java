/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio15 {

    /*Escribe un programa que dados dos números, uno real (base) y un entero
      positivo (exponente), saque por pantalla todas las potencias con base el
      numero dado y exponentes entre uno y el exponente introducido. No se deben
      utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
      se deberán mostrar 21, 22, 23, 24 y 25
      .*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        int exponente;

        do {
            System.out.println("ingresa la base");
            base = teclado.nextDouble();
            System.out.println("Ingresa el exponente");
            exponente = teclado.nextInt();
        } while (base <= 0 && exponente <= 0);

        for (int i = 1; i <= exponente; i++) {
            System.out.print(" " + base + "^" + i);
        }
    }
}
