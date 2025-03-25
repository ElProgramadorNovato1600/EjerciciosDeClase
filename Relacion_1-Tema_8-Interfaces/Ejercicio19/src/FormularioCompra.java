/**
 * @author Antonio Espinola Ramirez
 */

public class FormularioCompra implements Formulario {
    private String producto;
    private int cantidad;

    public FormularioCompra(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    @Override
    public void validar() {
        if (producto != null && !producto.isEmpty() && cantidad > 0) {
            System.out.println("Formulario de compra validado correctamente.");
        } else {
            System.out.println("Error: El formulario de compra no es válido.");
        }
    }

    @Override
    public void enviar() {
        System.out.println("Formulario de compra enviado.");
    }
}