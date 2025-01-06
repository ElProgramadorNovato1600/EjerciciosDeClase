/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2.libro;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */
public class Ejercicio8 {

    /*Modifica la Actividad 7 para que, además de los dos números aleatorios, también aparezca la operación que debe
     realizar el jugador: suma, resta o multiplicación.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random(System.currentTimeMillis());
        int aletorio = numAleatorio.nextInt(100);
        int aletorio2 = numAleatorio.nextInt(100);
        int opcion;
        int suma;
        int resta;
        int multiplicacion;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;

        System.out.println("El primer numero " + aletorio);
        System.out.println("El segundo numero " + aletorio2);

        //Menu Interactivo
        System.out.println("Eliga una opcion");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicacion");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("calcula la suma");
                suma = teclado.nextInt();
                resultadoSuma = aletorio + aletorio2;
                if (suma == resultadoSuma) {
                    System.out.println("El resultado es correcto " + suma);
                } else {
                    System.out.println("El resultado es incorrecto");
                }
                break;
            }
            case 2: {
                System.out.println("calcula la resta");
                resta = teclado.nextInt();
                resultadoResta = aletorio + aletorio2;
                if (resta == resultadoResta) {
                    System.out.println("El resultado es correcto " + resta);
                } else {
                    System.out.println("El resultado es incorrecto");
                }
                break;
            }
            case 3: {
                System.out.println("calcula la multiplicacion");
                multiplicacion = teclado.nextInt();
                resultadoMultiplicacion = aletorio + aletorio2;
                if (multiplicacion == resultadoMultiplicacion) {
                    System.out.println("El resultado es correcto " + multiplicacion);
                } else {
                    System.out.println("El resultado es incorrecto");
                }
                break;

            }
            default: {
                System.out.println("No introduciste ninguna opcion");
            }
        }
    }
}
