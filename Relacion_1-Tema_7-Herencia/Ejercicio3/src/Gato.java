/**
 * @author Antonio Espínola Ramírez
 */

class Gato extends Mamifero {
    // Implementación del sonido
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau!");
    }

    // Implementación del movimiento
    @Override
    public void moverse() {
        System.out.println("El gato camina sigilosamente.");
    }

    // Implementación de mostrar especie
    @Override
    public void mostrarEspecie() {
        System.out.println("Este es un Gato.");
    }

    // Metodo específico de Gato
    public void ronronear() {
        System.out.println("El gato está ronroneando.");
    }
}
