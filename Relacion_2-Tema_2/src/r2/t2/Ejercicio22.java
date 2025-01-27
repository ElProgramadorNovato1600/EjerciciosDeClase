/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio22 {

    /*Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/

    public static void main(String[] args) {
        //recorremos de 2 a 100
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;

            // Comprobamos si i es divisible por algún número entre 2 y la raíz cuadrada de i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false; // i no es primo
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
    }
}