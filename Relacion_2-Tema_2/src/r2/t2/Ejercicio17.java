/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio17 {

    /*Realiza un programa que sume los 100 números siguientes a un número entero
      y positivo introducido por teclado. Se debe comprobar que el dato introducido
      es correcto (que es un número positivo).
      */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        //Se valida que el numero sea positivo
        do {
            System.out.println("ingrese un numero ");
            numero = teclado.nextInt();
        } while (numero <= 0);

        for (int i = 1; i <= 100; i++) {
            suma = suma + (numero + i);
        }
        System.out.println(suma);
    }
}
