/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio5 {

    /*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
     un bucle while.*/

    public static void main(String[] args) {
        int contador = 160;
        int numero = 320;

        while (contador <= 320) {
            System.out.println(numero);
            numero = numero - 20;
            contador = contador + 20;
        }
    }

}