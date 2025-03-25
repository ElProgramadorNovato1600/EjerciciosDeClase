/**
 * @author Antonio Espinola Ramirez
 */

public class FormularioContacto  implements Formulario {
    private String nombre;
    private String mensaje;

    public FormularioContacto(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    @Override
    public void validar() {
        if (nombre != null && !nombre.isEmpty() && mensaje != null && !mensaje.isEmpty()) {
            System.out.println("Formulario de contacto validado correctamente.");
        } else {
            System.out.println("Error: El formulario de contacto no es válido.");
        }
    }

    @Override
    public void enviar() {
        System.out.println("Formulario de contacto enviado.");
    }
}