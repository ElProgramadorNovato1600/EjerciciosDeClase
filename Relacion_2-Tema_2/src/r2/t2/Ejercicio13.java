/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio13 {

    /*Escribe un programa que lea una lista de diez números y determine cuántos
      son positivos, y cuántos son negativos.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contPositivos = 0;
        int contNegativos = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Ingesa un numero");
            numero = teclado.nextInt();
            if (numero >= 0) {
                contPositivos++;
            } else {
                contNegativos++;
            }
        }
        System.out.println("Positivos " + contPositivos);
        System.out.println("Negativos " + contNegativos);
    }
}
