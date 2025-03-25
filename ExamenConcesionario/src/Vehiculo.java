/**
 * @author Antonio Espínola Ramírez
 */

public class Vehiculo {
    //Atributos
    private final int idVehiculo;
    private Vehiculo siguiente;
    private final String marca;
    private final String modelo;
    private double precio; //El precio de un vehiculo en un concesionario puede variar por eso no es final
    private final TipoVehiculo tipoVehiculo;
    private static int contadorVehiculos = 0;

    //Constructor
    public Vehiculo(String marca, String modelo, double precio, TipoVehiculo tipoVehiculo, Vehiculo siguiente) {
        this.idVehiculo = ++contadorVehiculos;
        this.siguiente = siguiente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
    }

    //Getters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public Vehiculo getSiguiente() {
        return siguiente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    //Setters
    public void setSiguiente(Vehiculo sig) {
        siguiente = sig;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    } //Como el precio de un coche puede variar añadi un setter

    /**
     * Metodo Static que muestra por pantalla el numero total de vehiculos registrados
     */
    public static void mostraTotalVehiculos() {
        System.out.println("Numero total de vehiculos registrados: " + contadorVehiculos);
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                "\nID Vehiculo: " + idVehiculo +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nPrecio:" + precio +
                "\nTipoVehiculo: " + tipoVehiculo;
    }
}