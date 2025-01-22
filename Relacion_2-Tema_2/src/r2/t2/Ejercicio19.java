/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio19 {

    /*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
      pedir por teclado. El carácter con el que se pinta la pirámide también se debe
      pedir por teclado.*/

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
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(caracter);
            }
            System.out.println();//salto de linea por cada fila
        }
    }
}
