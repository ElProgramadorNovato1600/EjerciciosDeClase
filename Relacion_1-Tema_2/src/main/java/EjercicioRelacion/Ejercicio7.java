/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRelacion;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Ejercicio7 {

    /*Crea un programa que pida al usuario un número entero. Si
     es múltiplo de 10, informará al usuario y pedirá un segundo
     número, para decir a continuación si este segundo número
     también es múltiplo de 10*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("ingresa un numero");
        numero = teclado.nextInt();

        if (numero % 10 == 0) {
            System.out.println("Es multiplo de 10");
            System.out.println("ingresa un segundo numero");
            numero = teclado.nextInt();
            if (numero % 10 == 0) {
                System.out.println("Es multiplo de 10");
            } else {
                System.out.println("no es multiplo");
            }
        } else {
            System.out.println("no es multiplo");
        }
    }
}
