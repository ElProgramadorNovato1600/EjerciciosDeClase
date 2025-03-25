import java.util.Scanner;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        try {
            String nombre = pedirNombre();
            System.out.println("Hola, " + nombre + "!");
        } catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodo para pedir un nombre valido
    public static String pedirNombre() throws NombreInvalidoException {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");

        String nombre = teclado.nextLine().trim();

        if (nombre.isEmpty() || !nombre.matches("[a-zA-Z ]+")) {
            throw new NombreInvalidoException("Error: El nombre es invalido. Debe contener solo letras y no estar vacio.");
        }
        return nombre;
    }
}
