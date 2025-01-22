/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio16 {

    /*Escribe un programa que diga si un número introducido por teclado es o no
      primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("ingresa un numero ");
        numero = teclado.nextInt();

        //Si el numero introducido es divisible entre 2 NO es primo, el unico numero primo divisible entre 2 es 2
        //Por eso esta la siguiente condicion

        if (numero != 2) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        if (contador == 1) {
            System.out.println("El numero " + numero + " no es primo");
        }
        if (contador == 0) {
            System.out.println("El numero " + numero + " es primo");
        }
    }
}
