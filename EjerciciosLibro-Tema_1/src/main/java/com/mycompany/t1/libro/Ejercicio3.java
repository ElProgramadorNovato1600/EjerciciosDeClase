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
public class Ejercicio3 {

    /*Modifica la Actividad 2 para que, indicando dos números n y m, diga
     qué cantidad hay que sumarle a n para que sea múltiplo de m.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        int resto;
        int total;

        System.out.println("Introduce un numero");
        numero = teclado.nextInt();

        System.out.println("Introduce un segundo numero");
        numero2 = teclado.nextInt();

        //operacion ternaria       
        //Si el numero es negativo lo devuelve positivo y si es positivo lo mantiene
        numero = numero < 0 ? -1 * (numero) : numero;
        numero2 = numero2 < 0 ? -1 * (numero2) : numero2;

        resto = (numero2 - (numero % numero2)) % numero2;
        total = resto + numero;
        System.out.println("Para que " + numero + " sea multiplo de 7 tienes que sumarle " + resto + " para que sea " + total);
    }
}
