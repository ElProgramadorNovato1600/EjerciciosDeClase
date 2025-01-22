/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio23 {

    /*Escribe un programa que permita ir introduciendo una serie indeterminada
      de números mientras su suma no supere el valor 10000. Cuando esto último
      ocurra, se debe mostrar el total acumulado, el contador de los números
      introducidos y la media.*/

    public static void main(String[] args) {
        int contador = 0;
        int numero;
        int suma = 0;
        int media = 0;
        boolean valorSuperado = false;
        Scanner teclado = new Scanner(System.in);

        while (!valorSuperado) {
            System.out.println("Ingrese un numero");
            numero = teclado.nextInt();
            suma = suma + numero;
            if (suma >= 10000) {
                valorSuperado = true;
                suma = suma - numero;
                contador--;
            }
            media = suma;
            contador++;
            media = media / contador;
        }
        System.out.println("Numeros introducidos " + contador);
        System.out.println("Suma total " + suma);
        System.out.println("Media " + media);
    }
}
