/**
 * @author Antonio Espínola Ramírez
 */

public class Main {
    public static void main(String[] args) {

        //Creamos una lista
        Concesionario concesionarioAlbolote = new Concesionario("Concesionario albolote");

        //Creamos los elementos de la lista (Vehiculos)
        concesionarioAlbolote.agregarVehiculo("Seat","ibiza",1000.0,TipoVehiculo.DEPORTIVO,null);
        concesionarioAlbolote.agregarVehiculo("Seat","altea",1500.0,TipoVehiculo.SUV,null);
        concesionarioAlbolote.agregarVehiculo("Porche","taycam",100000.0,TipoVehiculo.ELECTRICO,null);
        concesionarioAlbolote.agregarVehiculo("toyota","corolla",4500.0,TipoVehiculo.SEDAN,null);


        //Mostramos el total de vehiculos registrados (Metodo static)
        Vehiculo.mostraTotalVehiculos();
        System.out.println("-----------------------------------------------------------");

        //Mostramos los vehiculos
        concesionarioAlbolote.mostrarVehiculosDisponibles();
        System.out.println("-----------------------------------------------------------");

        //Vendemos un vehiculo (lo eliminamos del concesionario)
        concesionarioAlbolote.venderCoche(1);
        concesionarioAlbolote.mostrarVehiculosDisponibles();
    }
}