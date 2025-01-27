package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio15 {

    /*Escribe un programa que lea el título y el contenido de una página web. La aplicación generará por consola un
    documento HTML donde el título será un encabezado de primer nivel (<h1>) y el resto del contenido será un
    párrafo (<p>).*/

    public static void main(String[] args) {
        String titulo = LeerDatosEntrada.leerString("Introduce el titulo de la pagina web");
        String encabezado = LeerDatosEntrada.leerString("Introduce el encabezado de la pagina web");

        //Muestro la pagina web html
        System.out.println(titulo(titulo));
        System.out.println(encabezado(encabezado));
    }

    public static String titulo(String titulo) {
        return "<h1> " + titulo + " <h1>";
    }

    public static String encabezado(String encabezado) {
        return "<p> " + encabezado + " <p>";
    }
}
