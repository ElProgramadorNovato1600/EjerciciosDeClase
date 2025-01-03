/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio4 {

    /*Crea un programa que pida al usuario un número entero y
      diga si es par (pista: habrá que comprobar si el resto que se
      obtiene al dividir entre dos es cero: if (x % 2 == 0) ...).
      */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        //Si dividimos un numero entre 2 y el resto es 0, el numero es par.

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }
}
