import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un numero entero: ");
            int numero = scanner.nextInt();
            System.out.println("Has ingresado el numero: " + numero);
        } catch (   InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingresa un número entero.");
        }
    }
}
