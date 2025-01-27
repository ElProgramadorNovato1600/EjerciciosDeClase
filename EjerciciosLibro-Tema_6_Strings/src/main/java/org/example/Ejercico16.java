package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercico16 {

    /*Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye por otro símbolo no alfabético.
    Por ejemplo, el carácter ‘a’ se podría sustituir por el carácter ‘@’, la ‘e’ por ‘€’, la ‘i’ por ‘1’, etcétera.*/

    public static void main(String[] args) {
        char[] simbolos = {'*', '^', '?', '¿', '(', ')', '=', '[', '-', 'ª', '_', '-', 'ç', '~', '$', '#', '!', '>', '|'
                , '<', '&', '@', ';', ':', '1', '2'};
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String frase = LeerDatosEntrada.leerString("Introduce una frase").toLowerCase();
        for (int i = 0; i < abecedario.length(); i++) {
            frase = frase.replace(abecedario.charAt(i), simbolos[i]);
        }
        System.out.println(frase);
    }
}