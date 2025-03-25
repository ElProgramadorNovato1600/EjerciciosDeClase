/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        InterfazUsuario interfaz = new ConsolaInterfaz();

        interfaz.mostrarMensaje("Bienvenido al sistema.");

        String nombre = interfaz.recibirEntrada("Por favor, ingresa tu nombre: ");

        interfaz.mostrarMensaje("Hola, " + nombre + "!");

        interfaz.mostrarError("Este es un mensaje de error.");
    }
}