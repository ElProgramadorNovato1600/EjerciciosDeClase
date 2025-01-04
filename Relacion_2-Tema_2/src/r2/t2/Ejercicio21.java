/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio21 {

    /*Realiza un programa que vaya pidiendo números hasta que se introduzca un
      numero negativo y nos diga cuantos números se han introducido, la media de
      los impares y el mayor de los pares. El número negativo sólo se utiliza para
      indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean salir = false;
        int contador = 0;
        int contadorImpar = 0;
        int parMayor = 0;
        int sumaImpar = 0;
        int mediaImpar = 0;

        do {
            System.out.println("Ingresa un numero");
            numero = teclado.nextInt();
            if (numero <= 0) {
                salir = true;
            } else {
                contador++; //cantidad de numeros en total
                if (numero % 2 == 0 && numero > parMayor) {
                    parMayor = numero; // mayor de los pares
                }
                if (numero % 2 == 1) {
                    contadorImpar++; //cantidad de numeros impares
                    sumaImpar = sumaImpar + numero; // suma de los impares
                    mediaImpar = sumaImpar / contadorImpar; // media de los impares
                }
            }
        } while (!salir);
        System.out.println("total de numeros " + contador);
        System.out.println("media de impares " + mediaImpar);
        System.out.println("mayor de los pares " + parMayor);
    }
}
