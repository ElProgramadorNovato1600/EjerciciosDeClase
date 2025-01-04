/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio29 {

    /*Escribe un programa que muestre por pantalla todos los números enteros
      positivos menores a uno leído por teclado que no sean divisibles entre otro
      también leído de igual forma.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroDivisor;

        do {
            System.out.println("ingresa un numero");
            numero = teclado.nextInt();
            System.out.println("Introduce el divisor");
            numeroDivisor = teclado.nextInt();
        } while (numeroDivisor > numero && numeroDivisor <= 0);
        for (int i = 0; i < numero; i++) {
            if (i % numeroDivisor != 0) {
                System.out.println(i);
            }
        }
    }
}
