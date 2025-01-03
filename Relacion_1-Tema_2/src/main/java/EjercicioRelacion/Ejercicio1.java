/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio1 {

    /*El usuario ingresará dos números (a y b), y el programa mostrará el resultado de la operación (a+b)*(ab) y el
      resultado de la operación a2b2 (a al cuadrado menos b al cuadrado). Ambos resultados se deben mostrar en la misma
      línea.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Ingresa un numero");
        a = teclado.nextInt();
        System.out.println("Ingresa un numero");
        b = teclado.nextInt();

        System.out.println("resultado 1: " + (a + b) * (a * b) + " y el resultado 2: " + ((a * a) - (b * b)));

        //Otra forma de hacerlo, en este caso usando el metodo .pow() de la libreria Math

        //int resultado1 = (a+b)*(a*b);
        //int resultado2 = (int) (Math.pow(a, 2) - Math.pow(b, 2));
    }
}
