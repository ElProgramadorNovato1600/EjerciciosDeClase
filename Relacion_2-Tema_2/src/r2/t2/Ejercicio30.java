
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r2.t2;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class Ejercicio30 {

    /*Realiza una programa que calcule las horas transcurridas entre dos horas de
      dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
      El día de la semana se puede pedir como un número (del 1 al 7) o como una
      cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
      los datos correctamente y que el segundo día es posterior al primero.
      Ejemplo:
      Por favor, introduzca la primera hora.
      Día: lunes
      Hora: 18
      Por favor, introduzca la segunda hora.
      Día: martes
      Hora: 20
      Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia = 0;
        int hora;
        int dia2 = 0;
        int hora2;
        int totalHoras;

        //compruebo el rango de dias 1-7 y de horas 0-23
        do {
            System.out.println("Ingrese el día de la semana (1-7):");
            dia = teclado.nextInt();
            System.out.println("Ingrese la hora (0-23):");
            hora = teclado.nextInt();
        } while (dia < 1 || dia > 7 || hora < 0 || hora >= 24);

        //Hago las mismas comprobaciones
        //Tambien compruebo que el segundo dia sea posterior al primer dia
        do {
            System.out.println("Ingrese el segundo día de la semana (1-7):");
            dia2 = teclado.nextInt();
            System.out.println("Ingrese la hora (0-23):");
            hora2 = teclado.nextInt();
        } while (dia2 < 1 || dia2 > 7 || dia2 <= dia || hora2 < 0 || hora2 >= 24);

        totalHoras = (dia2 - dia) * 24 + (hora2 - hora);
        System.out.println("hay " + totalHoras + " horas de diferencia");
    }

}
