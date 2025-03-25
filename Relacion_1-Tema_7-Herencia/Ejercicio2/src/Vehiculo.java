/**
 * @author Antonio Espínola Ramírez
 */

public abstract class Vehiculo {
    // Atributos de clase
    protected static int vehiculosCreados = 0;
    protected static int kilometrosTotales = 0;

    // Atributo de instancia
    protected int kilometrosRecorridos;

    // Constructor
    public Vehiculo() {
        vehiculosCreados++;
        kilometrosRecorridos = 0;
    }

    // Metodo para añadir kilómetros
    public void andar(int kilometros) {
        kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
    }

    // Metodo abstracto que será implementado por las subclases
    public abstract void accionEspecifica();

    // Metodo para obtener el kilometraje total
    public static int getKilometrajeTotal() {
        return kilometrosTotales;
    }

    // Metodo para obtener los vehículos creados
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }
}