/**
 * @author Antonio Espínola Ramírez
 */

public class Concesionario {
    //Atributos
    private final String nombre; //Nombre del concesionario
    private Vehiculo primero;
    private int cantidadVehiculos;

    //Constructor
    public Concesionario(String nombre) {
        this.nombre = nombre;
        primero = null;
        cantidadVehiculos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que agrega un vehiculo a la lista
     *
     * @param marca        marca del vehiculo
     * @param modelo       modelo del vehiculo
     * @param precio       precio del vehiculo
     * @param tipoVehiculo tipo del vehiculo (enum)
     * @param siguiente    Siguiente vehiculo puntero (apunta al siguiente vehiculo)
     */
    public void agregarVehiculo(String marca, String modelo, double precio, TipoVehiculo tipoVehiculo, Vehiculo siguiente) {
        Vehiculo nuevo = new Vehiculo(marca, modelo, precio, tipoVehiculo, null);
        if (primero == null) { //si la lista esta vacia lo mete en el primero
            primero = nuevo;
        } else {
            Vehiculo actual = primero; // empieza desde el primer nodo
            while (actual.getSiguiente() != null) { // comprueba cual es el seiguiente hasta encontrar un null
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo); // lo inserta al final
        }
        cantidadVehiculos++; //nuevo elemento añadido
    }

    /**
     * Eliminas un vehiculo (Lo vendes) a traves de su id
     * Se recorre la lista hasta encontrar con el vehiculo y se elimina
     * Si no se encuentra se mostrara un mensaje por pantalla
     *
     * @param idVehiculo Id del vehiculo que quieres eliminar
     */

    public void venderCoche(int idVehiculo) {
        if (primero == null)
            System.out.println("No hay ningun coche");
        else if (primero.getIdVehiculo() == idVehiculo) { // Si es el primero elemento de lista lo eliminamos
            primero = primero.getSiguiente(); //Si eliminas el primer elemento apunta al segundo
            cantidadVehiculos--;
        } else { // Si no es el primero vamos recorriendo la lista hasta que encontremos el elemento
            Vehiculo actual = primero; // El Nodo "actual" es una variable auxiliar que contiene el elemento a comprobar de la lista
            while (actual.getSiguiente() != null && actual.getSiguiente().getIdVehiculo() != idVehiculo) // Se comprueba el siguiente del actual
                actual = actual.getSiguiente();
            if (actual.getSiguiente() == null) // Si hemos llegado al último elemento y no lo hemos encontrado es que no está
                System.out.println("El vehiculo: " + idVehiculo + " no esta en el concesionario");
            else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // se apunta 1 2 3  el 1 apuntaria al 3 y quedaria asi 1 3
                cantidadVehiculos--;
            }
        }
    }

    /**
     * Muestro la lista de vehiculos
     */
    public void mostrarVehiculosDisponibles() {
        Vehiculo actual = primero;
        while (actual.getSiguiente() != null) { // recorremos la lista hasta el penúltimo elemento
            System.out.println("Nombre Concesionario: " + getNombre());
            System.out.println(actual);
            System.out.println();//salto de linea
            actual = actual.getSiguiente();
        }
        System.out.println(actual); // mostramos el último elemento
    }

    /**
     * cantidad de vehiculos
     *
     * @return Devuelve la cantidad de vehiculos de la lista
     */
    public int numeroVehiculos() {
        return cantidadVehiculos;
    }
}