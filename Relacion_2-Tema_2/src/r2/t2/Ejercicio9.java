/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio9 {

    /*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
      por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
      la salvedad de que el anterior estaba limitado a números de 5 dígitos como
      máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
      esta manera, la única limitación en el número de dígitos la establece el tipo de
      dato que se utilice (int o long).*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Ingresa u numero");
        numero = teclado.nextInt();

        //Math.abs() devuelve el valor absoluto de numero decimal
        if (numero == 0) {
        } else {
            for (int i = Math.abs(numero); i > 0; i = i / 10) {
                contador++;
            }
        }
        System.out.println("numero de digitos " + contador);
    }
}
