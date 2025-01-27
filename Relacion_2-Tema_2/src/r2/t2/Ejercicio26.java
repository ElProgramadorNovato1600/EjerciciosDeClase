/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio26 {

    /*Realiza un programa que pida primero un número y a continuación un dígito.
      El programa nos debe dar la posición (o posiciones) contando de derecha a
      izquierda que ocupa ese dígito en el número introducido.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int digito;
        int posicion = 1;
        int ultimoDigito;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("ingresa un digito");
        digito = teclado.nextInt();

        while (numero > 0) {
            ultimoDigito = numero % 10;
            if (ultimoDigito == digito) {
                System.out.println("Posicion: " + posicion);
            }
            numero = numero / 10;
            posicion++;
        }
    }
}
