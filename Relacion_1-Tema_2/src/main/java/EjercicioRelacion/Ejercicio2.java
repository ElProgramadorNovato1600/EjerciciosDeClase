/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio2 {
    /*Crea una variante del programa anterior, que pide al usuario
       un número y muestra su tabla de multiplicar*/

    //Nota son ejercicios en los que no se usan estructuras de control

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a;

        System.out.println("Ingresa un numero");
        a = teclado.nextInt();

        System.out.println("tabla de multiplicar de " + a);

        System.out.println((a) + " " + (a * 2) + " " + (a * 3) + " " + (a * 4) + " " + (a * 5) + " " + (a * 6) + " " + (a * 7) + " " + (a * 8) + " " + (a * 9) + " " + (a * 10));
    }
}
