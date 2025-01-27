/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio27 {

    /*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
      entre 1 y un número leído por teclado.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int multiplos;
        int suma = 0;

        do {
            System.out.println("ingresa un numero");
            numero = teclado.nextInt();
        } while (numero <= 1);
        for (int i = 1; i < numero; i++) {
            multiplos = i * 3;
            if (multiplos <= numero) {
                System.out.print("Multiplos "+multiplos+"\n");
                suma = multiplos + suma;                                
            }
        }
        System.out.println("suma total "+suma);
    }

}
