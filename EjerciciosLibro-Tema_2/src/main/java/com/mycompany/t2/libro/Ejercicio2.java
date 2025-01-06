/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio2 {

    /*El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
    letra = número DNI módulo 22
    Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:

    | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 |
    |---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
    | T | R | W | A | G | M | Y | F | P | D | X | B | N | J | Z | S | Q | V | H | L | C | K | E |

    y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
    Observa que un número de 8 dígitos está dentro del rango del tipo `int`.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDNI;
        char letraDNI = 0;

        System.out.println("Ingresa el dni sin la letra");
        numeroDNI = teclado.nextInt();

        numeroDNI = numeroDNI % 23; //Obtengo la posicion de la letra

        switch (numeroDNI) {//Obtengo la letra
            case 0: {
                letraDNI = 'T';
                break;
            }
            case 1: {
                letraDNI = 'R';
                break;
            }
            case 2: {
                letraDNI = 'W';
                break;
            }
            case 3: {
                letraDNI = 'A';
                break;
            }
            case 4: {
                letraDNI = 'G';
                break;
            }
            case 5: {
                letraDNI = 'M';
                break;
            }
            case 6: {
                letraDNI = 'Y';
                break;
            }
            case 7: {
                letraDNI = 'F';
                break;
            }
            case 8: {
                letraDNI = 'P';
                break;
            }
            case 9: {
                letraDNI = 'D';
                break;
            }
            case 10: {
                letraDNI = 'X';
                break;
            }
            case 11: {
                letraDNI = 'B';
                break;
            }
            case 12: {
                letraDNI = 'N';
                break;
            }
            case 13: {
                letraDNI = 'J';
                break;
            }
            case 14: {
                letraDNI = 'Z';
                break;
            }
            case 15: {
                letraDNI = 'S';
                break;
            }
            case 16: {
                letraDNI = 'Q';
                break;
            }
            case 17: {
                letraDNI = 'V';
                break;
            }
            case 18: {
                letraDNI = 'H';
                break;
            }
            case 19: {
                letraDNI = 'L';
                break;
            }
            case 20: {
                letraDNI = 'C';
                break;
            }
            case 21: {
                letraDNI = 'K';
                break;
            }
            case 22: {
                letraDNI = 'E';
                break;
            }
        }
        System.out.println("Tu letra del dni es " + letraDNI);
    }
}
