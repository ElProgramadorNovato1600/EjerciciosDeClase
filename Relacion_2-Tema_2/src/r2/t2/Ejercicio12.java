/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio12 {

    /*Escribe un programa que muestre los n primeros términos de la serie de
      Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
      el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
      términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
      introducir por teclado.
      */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fibonachi;
        int numero = 0;
        int numero2 = 1;

        System.out.println("ingresa fibonachi");
        fibonachi = teclado.nextInt();

        if (fibonachi > 1) {
            for (int i = 1; i < fibonachi; i++) {
                numero2 = numero + numero2;
                numero = numero2 - numero;
                if (i == fibonachi - 1) {
                    System.out.println(numero2);
                }
            }
        }
    }
}
