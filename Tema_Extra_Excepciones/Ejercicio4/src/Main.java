import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingresa una cadena que represente un numero: ");
            String cadena = teclado.nextLine();
            int numero = Integer.parseInt(cadena);
            System.out.println("El numero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no se puede convertir a un numero entero.");
        }
    }
}