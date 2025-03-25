/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camiseta", 19.99);
        Producto producto2 = new Producto("Pantalón", 29.99);
        Producto producto3 = new Producto("Sombrero", 19.99);

        // Comparar productos
        System.out.println("Comparando producto1 con producto2: " + producto1.compareTo(producto2)); // Resultado esperado: -1
        System.out.println("Comparando producto1 con producto3: " + producto1.compareTo(producto3)); // Resultado esperado: 0
        System.out.println("Comparando producto2 con producto3: " + producto2.compareTo(producto3)); // Resultado esperado: 1
    }
}