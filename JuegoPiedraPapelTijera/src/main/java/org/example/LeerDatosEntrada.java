package org.example;

import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */
public class LeerDatosEntrada {

    public static int leerEntero(String mensaje) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(mensaje);

        //Este bucle se encarga de comprobar que se haya introducido en el teclado
        //una cadena que coincida con el tipo a leer (int) para que se pueda convertir
        //adecuadamente
        while (!teclado.hasNextInt()) {
            System.out.println("Error. No has introducido un entero: ");
            teclado.nextLine();
        }

        //Ya podemos hacer la lectura y conversi�n sin que haya errores.
        int numero = teclado.nextInt();
        return numero;
    }

    public static int leerEnteroConUnMinimo(String mensaje, int minimo) {

        //Esta funcion tambien sirve para determinar el minimo del numero introducido 
        // por ejemplo si el minimo es 0 el numero introducido sera mayor que 0
        int numero;
        do {

            numero = leerEntero(mensaje);
        } while (numero < minimo);

        return numero;
    }

    public static int leerEnteroConRango(String mensaje, int minimo, int maximo) {

        //Esta funcion tambien determina el rango del entero con un minimo y un max 
        // por ejemplo introducir un numero que sea mayor que 0 y menor 100 (0-100)
        int numero;
        do {
            numero = leerEntero(mensaje);
            if (numero < minimo) {
                System.out.println("El valor debe ser mayor o igual que el minimo");
            } else if (numero > maximo) {
                System.out.println("El valor debe ser menor o igual que el maximo");
            }
        } while (numero < minimo || numero > maximo);
        return numero;
    }

    public static double leerDouble(String mensaje) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(mensaje);

        //Este bucle se encarga de comprobar que se haya introducido en el teclado
        //una cadena que coincida con el tipo a leer (double) para que se pueda convertir
        //adecuadamente
        while (!teclado.hasNextDouble()) {
            System.out.println("Error. No has introducido un double: ");
            teclado.nextLine();
        }

        double numero = teclado.nextDouble();
        return numero;
    }

    public static double leerDoubleConUnMinimo(String mensaje, double minimo) {

        //Esta funcion tambien sirve para determinar el minimo del numero introducido 
        // por ejemplo si el minimo es 0 el numero introducido sera mayor que 0.00
        double numero;
        do {

            numero = leerDouble(mensaje);
        } while (numero < minimo);

        return numero;
    }

    public static Double leerDoubleConRango(String mensaje, double minimo, double maximo) {

        //Esta funcion tambien determina el rango del double con un minimo y un max 
        // por ejemplo introducir un numero que sea mayor que 0 y menor 100 (1.00-99.00)
        double numero;
        if (minimo >= maximo) {
            throw new IllegalArgumentException("El \"minimo\" tiene que ser menor que el \"maximo\", tampoco pueden ser iguales");
        }
        if (maximo <= minimo) {
            throw new IllegalArgumentException("El \"maximo\" tiene que ser mayor que el \"minimo\", tampoco pueden ser iguales");
        }

        numero = leerDouble(mensaje);

        return numero;

    }

    public static String leerString(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        while (!teclado.hasNextLine()) {
            System.out.println("Error. No has introducido una cadena de caracteres: ");
            teclado.nextLine();
        }
        mensaje = teclado.nextLine();
        return mensaje;
    }
}
