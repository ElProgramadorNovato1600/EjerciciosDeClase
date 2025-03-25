/**
 * @author Antonio Espinola Ramirez
 */

public class FormularioRegistro  implements Formulario{
    private String nombre;
    private String correo;

    public FormularioRegistro(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void validar() {
        if (nombre != null && !nombre.isEmpty() && correo != null && correo.contains("@")) {
            System.out.println("Formulario de registro validado correctamente.");
        } else {
            System.out.println("Error: El formulario de registro no es válido.");
        }
    }

    @Override
    public void enviar() {
        System.out.println("Formulario de registro enviado.");
    }
}