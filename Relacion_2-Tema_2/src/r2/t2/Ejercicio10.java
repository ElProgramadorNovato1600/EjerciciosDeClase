/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio10 {

    /*Escribe un programa que calcule la media de un conjunto de números positivos
      introducidos por teclado. A priori, el programa no sabe cuántos números se
      introducirán. El usuario indicará que ha terminado de introducir los datos
      cuando meta un número negativo.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            if (numero > 0) {
                suma = suma + numero;
            }
        } while (numero > 0);
        System.out.println("total " + suma);
    }
}
