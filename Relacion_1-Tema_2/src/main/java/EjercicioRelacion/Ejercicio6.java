/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio6 {

    /*Crea un programa que pida al usuario dos números enteros y
      diga si el primero es múltiplo del segundo (pista: igual que
      antes, habrá que ver si el resto de la división es cero: a % b == 0).
      */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("ingresa un numero");
        numero = teclado.nextInt();
        System.out.println("ingresa un numero");
        numero2 = teclado.nextInt();

        if (numero % numero2 == 0) {
            System.out.println(numero + " es multiplo de " + numero2);
        } else {
            System.out.println("No son multiplos");
        }
    }
}
