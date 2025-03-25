/**
 * @author Antonio Espinola Ramirez
 */

public class ProductoElectronico extends Producto implements Enviable {

    //Constructor
    public ProductoElectronico(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    @Override
    public double calcularCostoEnvio() {
        return getPrecio() * 0.10; // 10% del precio
    }
}