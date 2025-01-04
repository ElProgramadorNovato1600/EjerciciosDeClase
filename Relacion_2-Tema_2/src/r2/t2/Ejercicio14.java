/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio14 {

    /*Escribe un programa que pida una base y un exponente (entero positivo) y que
      calcule la potencia.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base;
        int exponente;
        int potencia;

        //validamos que la base y el exponente sean positivos
        do {
            System.out.println("ingresa la base");
            base = teclado.nextInt();
            System.out.println("Ingresa el exponente");
            exponente = teclado.nextInt();
        } while (base <= 0 && exponente <= 0);

        potencia = (int) Math.pow(base, exponente);
        System.out.println("Potencia " + potencia);
    }
}
