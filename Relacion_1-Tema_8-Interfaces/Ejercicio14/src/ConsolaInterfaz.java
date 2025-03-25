/**
 * @author Antonio Espinola Ramirez
 */

import java.util.Scanner;

public class ConsolaInterfaz implements InterfazUsuario {

    private Scanner scanner;

    public ConsolaInterfaz() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String recibirEntrada(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    @Override
    public void mostrarError(String error) {
        System.err.println("Error: " + error);
    }
}