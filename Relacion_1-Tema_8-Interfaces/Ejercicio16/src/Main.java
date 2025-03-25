/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        ProductoElectronico telefono = new ProductoElectronico("Teléfono Móvil", 500.0, 10);
        ProductoFisico camiseta = new ProductoFisico("Camiseta", 20.0, 50);

        // Utilizamos una variable de tipo Enviable para calcular el costo de envío
        Enviable enviable1 = telefono;
        Enviable enviable2 = camiseta;

        // Mostrar información sobre los productos y su costo de envío
        System.out.println(telefono);
        System.out.println("Costo de envío: $" + enviable1.calcularCostoEnvio());

        System.out.println(camiseta);
        System.out.println("Costo de envío: $" + enviable2.calcularCostoEnvio());
    }
}