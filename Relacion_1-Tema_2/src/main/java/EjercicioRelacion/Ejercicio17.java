/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio17 {

    /*Crea un programa que pida al usuario dos números enteros y
      diga "Uno de los números es positivo", "Los dos números
      son positivos" o bien "Ninguno de los números es positivo",
      según corresponda.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;

        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        System.out.println("Ingresa un numero");
        numero2 = teclado.nextInt();


        if (numero < 0 && numero2 < 0) {
            System.out.println("Ninguno de los números es positivo");
        } else if (numero >= 0 && numero2 >= 0) {
            System.out.println("Los dos números son positivos");
        } else if (numero >= 0 && numero2 < 0) {
            System.out.println("Uno de los números es positivo");
        } else {
            System.out.println("Uno de los números es positivo");
        }
    }
}
