package r2.t2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio1 {

    /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for*/

    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
