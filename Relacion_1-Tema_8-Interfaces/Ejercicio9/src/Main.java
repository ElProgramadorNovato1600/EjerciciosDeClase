/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        Conductor conductorAutobus = new ConductorAutobus("Juan");
        Conductor conductorTaxi = new ConductorTaxi("Pedro");

        // Llamar al metodo conducir() en ambas clases
        conductorAutobus.conducir();  // Debería imprimir el mensaje del autobús
        conductorTaxi.conducir();     // Debería imprimir el mensaje del taxi
    }
}