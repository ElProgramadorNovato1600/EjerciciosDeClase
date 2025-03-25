/**
 * @author Antonio Espinola Ramirez
 */

public class ProductoFisico extends Producto implements Enviable {

    //Constructor
    public ProductoFisico(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public double calcularCostoEnvio() {
        return 5.0; // Costo fijo de envío
    }
}