import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        try {
            int numero = pedirNumeroPositivo();
            System.out.println("Has introducido el numero: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No has introducido un numero valido.");
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodo para pedir numero positivo
    public static int pedirNumeroPositivo() throws ValorNegativoException {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero positivo: ");

        int numero = Integer.parseInt(teclado.nextLine());

        if (numero < 0) {
            throw new ValorNegativoException("Error: El numero introducido es negativo.");
        }
        return numero;
    }
}
