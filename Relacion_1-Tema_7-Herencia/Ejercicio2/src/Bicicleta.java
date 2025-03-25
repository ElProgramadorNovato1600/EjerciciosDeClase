/**
 * @author Antonio Espínola Ramírez
 */
class Bicicleta extends Vehiculo {

    @Override
    public void accionEspecifica() {
        System.out.println("¡Haz el caballito con la bicicleta!");
    }

    // Metodo específico de la Bicicleta
    public void hacerCaballito() {
        System.out.println("¡Haciendo el caballito con la bicicleta!");
    }
}
