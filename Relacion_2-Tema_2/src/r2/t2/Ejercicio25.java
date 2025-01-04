/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio25 {

    /*Realiza un programa que pida un número por teclado y que luego muestre ese
      número al revés.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int digito;
        int numeroVuelta;

        System.out.println("ingresa un numero");
        numero = teclado.nextInt();

        numeroVuelta = numero;
        if (numero > 10) {
            while (numeroVuelta != 0) {
                digito = numeroVuelta % 10;
                System.out.print(digito);
                numeroVuelta = numeroVuelta / 10;
            }
        } else {
            System.out.println(numero);
        }
    }
}