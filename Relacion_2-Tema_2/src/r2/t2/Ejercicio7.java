/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio7 {

    /*Realiza el control de acceso a una caja fuerte. La combinación será un
      número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
      acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
      y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
      Tendremos cuatro oportunidades para abrir la caja fuerte.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int combinacion = 1234;
        boolean cajaAbierta = false;
        int numero;
        int oportunidades = 3;

        System.out.println("Ingresa combinacion");
        numero = teclado.nextInt();

        while (!cajaAbierta && oportunidades > 0) {
            if (combinacion == numero) {
                cajaAbierta = true;
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                System.out.println("Ingresa combinacion");
                numero = teclado.nextInt();
                oportunidades--;
                if (oportunidades == 0) {
                    System.out.println("lo siento, se te acabaron las oportunidades...");
                }
            }
        }
    }
}
