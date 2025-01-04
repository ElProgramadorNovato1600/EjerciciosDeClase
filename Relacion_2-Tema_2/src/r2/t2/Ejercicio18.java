/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio18 {

    /*Escribe un programa que obtenga los números enteros comprendidos entre dos
      números introducidos por teclado y validados como distintos, el programa debe
      empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        int menor;

        //validamos que los numeros son distintos
        do {
            System.out.println("Ingresa un numero");
            numero = teclado.nextInt();
            System.out.println("Ingresa un numero");
            numero2 = teclado.nextInt();
        } while (numero == numero2);

        //Comprobamos que numero es el menor y dado esto incrementamos de 7 en 7

        if (numero < numero2) {
            menor = numero;
            while (menor <= numero2) {
                System.out.println(menor);
                menor = menor + 7;
            }
        } else {
            menor = numero2;
            while (menor <= numero) {
                System.out.println(menor);
                menor = menor + 7;
            }
        }
    }
}