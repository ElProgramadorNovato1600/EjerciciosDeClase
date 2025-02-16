
/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*El cifrado César es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el código.ç
     Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto n posiciones detrás.

     Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q se codifica con la x.
     En el caso de que una letra exceda a la z, seguiremos de forma circular utilizando la a. Solo se cifrarán las letras,
     mayúsculas o minúsculas.
     Realiza una clase que, mediante un metodo estático, devuelva cifrado el texto que se le pasa con un paso de n letras.*/

    public static void main(String[] args) {

        String cadena = "Hola soy Antonio estudiante de 1º DAW";
        String cadenaCifrada = cifradoCesar.cifrar(cadena, 3);

        System.out.println(cadena);
        System.out.println(cadenaCifrada);
    }
}