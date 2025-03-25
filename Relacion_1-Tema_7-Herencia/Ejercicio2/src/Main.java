import java.util.Scanner;

/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de la primera.
     Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el atributo de
     instancia kilometrosRecorridos. Crea también algún metodo específico para cada una de las subclases.
     Prueba las clases creadas mediante un programa con un menú como el que se muestra a continuación:

     VEHÍCULOS
     =========
     1. Anda con la bicicleta
     2. Haz el caballito con la bicicleta
     3. Anda con el coche
     4. Quema rueda con el coche
     5. Ver kilometraje de la bicicleta
     6. Ver kilometraje del coche
     7. Ver kilometraje total
     8. Salir
     Elige una opción (1-8):*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear los objetos Vehiculo
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion = 0;
        while (opcion != 8) {
            // Menú interactivo
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");
            opcion = teclado.nextInt();

            // Realizar la acción según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros vas a andar con la bicicleta? ");
                    int kmBici = teclado.nextInt();
                    bicicleta.andar(kmBici);
                    System.out.println("Andaste " + kmBici + " kilómetros con la bicicleta.");
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros vas a andar con el coche? ");
                    int kmCoche = teclado.nextInt();
                    coche.andar(kmCoche);
                    System.out.println("Andaste " + kmCoche + " kilómetros con el coche.");
                    break;
                case 4:
                    coche.quemarRueda();
                    break;
                case 5:
                    System.out.println("Kilometraje de la bicicleta: " + bicicleta.kilometrosRecorridos + " km.");
                    break;
                case 6:
                    System.out.println("Kilometraje del coche: " + coche.kilometrosRecorridos + " km.");
                    break;
                case 7:
                    System.out.println("Kilometraje total de todos los vehículos: " + Vehiculo.getKilometrajeTotal() + " km.");
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        teclado.close();
    }
}