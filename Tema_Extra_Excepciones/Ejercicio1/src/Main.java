import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer numero entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo numero entero: ");
            int num2 = scanner.nextInt();

            int result = Math.addExact(num1, num2);

            System.out.println("El resultado de la suma es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Desbordamiento de entero. El resultado excede el rango permitido.");
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}
