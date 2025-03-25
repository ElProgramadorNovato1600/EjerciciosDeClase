/**
 * @author Antonio Espínola Ramírez
 */
class Coche extends Vehiculo {

    @Override
    public void accionEspecifica() {
        System.out.println("¡Quema rueda con el coche!");
    }

    // Metodo específico del Coche
    public void quemarRueda() {
        System.out.println("¡Quema rueda con el coche!");
    }
}