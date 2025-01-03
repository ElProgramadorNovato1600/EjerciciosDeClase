/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio13 {

    /*Crea un programa que pida al usuario un número entero y
      responda si no es múltiplo de 2 ni de 3*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        if (numero % 2 > 0 && numero % 3 > 0) {
            System.out.println("No es mutltiplo 2 y 3");
        } else {
            System.out.println("Es multiplo");
        }
    }
}
