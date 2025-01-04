/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio4 {

    /*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
     un bucle for.
     */

    public static void main(String[] args) {
        int contador = 320;

        for (int i = 160; i <= 320; i = i + 20) {
            System.out.println(contador);
            contador = contador - 20;

        }
    }
}
