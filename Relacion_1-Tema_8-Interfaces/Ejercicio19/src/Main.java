/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        // Crear formularios
        Formulario formularioRegistro = new FormularioRegistro("Juan Pérez", "juan@example.com");
        Formulario formularioContacto = new FormularioContacto("Carlos", "Quisiera más información sobre los productos.");
        Formulario formularioCompra = new FormularioCompra("Laptop", 2);

        // Validar y enviar el formulario de registro
        System.out.println("Formulario de Registro:");
        formularioRegistro.validar();
        formularioRegistro.enviar();
        System.out.println();

        // Validar y enviar el formulario de contacto
        System.out.println("Formulario de Contacto:");
        formularioContacto.validar();
        formularioContacto.enviar();
        System.out.println();

        // Validar y enviar el formulario de compra
        System.out.println("Formulario de Compra:");
        formularioCompra.validar();
        formularioCompra.enviar();
    }
}