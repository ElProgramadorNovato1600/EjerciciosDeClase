package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio18 {

    /*Escribe una aplicación que convierte una frase (que puede estar escrita con cualquier combinación de mayúsculas y
     minúsculas) en el nombre de una variable que utilice la nomenclatura Camel. Por ejemplo, la frase «Me Gusta
     merendar galletas», se convertirá en «meGustaMerendarGalletas».

     Supondremos que cada palabra que compone la frase está separada por un único espacio en blanco.*/

    public static void main(String[] args) {
        String frase = "HoLa SoY aNtoNIO estuDIO dAW";
        //convertimos la frase a minuscula
        String[] camel = frase.toLowerCase().split(" ");
        System.out.print(camel[0]);

        for (int i = 1; i < camel.length; i++) {
            System.out.print(camel[i].toUpperCase().charAt(0));
            System.out.print(camel[i].substring(1));
        }
    }
}