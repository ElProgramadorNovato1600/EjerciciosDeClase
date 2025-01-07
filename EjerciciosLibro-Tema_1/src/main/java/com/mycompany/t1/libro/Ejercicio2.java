/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t1.libro;

import java.util.Scanner;

/**
 *
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio2 {

    /*Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el
     resultado sea múltiplo de 7. Un ejemplo:

     ■ A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
     ■ A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.

     Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1, respectivamente.

     Pista: El operador módulo puede ser muy útil para solucionar esta actividad.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int resto;
        int total;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        //operacion ternaria       
        //Si el numero es negativo lo devuelve positivo y si es positivo lo mantiene
        numero = numero < 0 ? -1 * (numero) : numero;

        resto = (7 - (numero % 7)) % 7;

        total = resto + numero;
        System.out.println("Para que " + numero + " sea multiplo de 7 tienes que sumarle " + resto + " para que sea " + total);
    }
}
