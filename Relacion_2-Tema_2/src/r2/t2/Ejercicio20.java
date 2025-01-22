/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio20 {

    /*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        char caracter;

        System.out.println("ingresa la altura de la piramide");
        altura = teclado.nextInt();

        System.out.println("Ingresa el caracter");
        caracter = teclado.next().charAt(0);

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= (altura - i); j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println(caracter);//la punta de la piramide
            } else if (i == altura) {
                for (int j = 1; j <= (2 * i - 1); j++) { //la ultima fila llena de caracter
                    System.out.print(caracter);
                }
                System.out.println();
            } else {
                System.out.print(caracter); // Carácter al principio
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print(caracter); // Carácter al final
                System.out.println(); // Salto de línea
            }
        }
    }
}