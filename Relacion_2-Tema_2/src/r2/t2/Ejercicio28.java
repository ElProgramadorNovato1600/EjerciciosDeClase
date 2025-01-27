/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio28 {

    /*Escribe un programa que calcule el factorial de un número entero leído por teclado.
      Ejemplo:
      Por favor, introduzca un número entero: 6
      6! = 720 */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int guardoNumero;

        do {
            System.out.println("introduce un numero");
            numero = teclado.nextInt();
        } while (numero < 1);
        guardoNumero = numero;
        for (int i = 1; i < guardoNumero; i++) {
            numero = i * numero;
        }
        System.out.println(numero);
    }
}
