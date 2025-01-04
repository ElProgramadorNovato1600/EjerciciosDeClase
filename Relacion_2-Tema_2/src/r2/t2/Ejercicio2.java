/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio2 {

    /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/

    public static void main(String[] args) {
        int numero = 0;

        System.out.println(numero); //Muestro el primer numero

        while(numero <100){
            numero++;
            if (numero %5==0) {
                System.out.println(numero);
            }
            
        }
    }
}
