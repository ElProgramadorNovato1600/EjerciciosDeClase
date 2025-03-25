/**
 * @author Antonio Espinola Ramirez
 */

public class Producto implements Ordenable {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre= nombre;
        this.precio = precio;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para el precio
    public double getPrecio() {
        return precio;
    }

    // Implementacion del metodo compareTo
    @Override
    public int compareTo(Object o) {
        if (o instanceof Producto) {
            Producto otroProducto = (Producto) o;

            // Compara los precios
            if (this.precio < otroProducto.precio) {
                return -1; // Este objeto es más barato
            } else if (this.precio > otroProducto.precio) {
                return 1;  // Este objeto es más caro
            } else {
                return 0;  // Son iguales en precio
            }
        }
        return -2;  // Si el objeto no es una instancia de Producto, devolvera -2
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio;
    }
}