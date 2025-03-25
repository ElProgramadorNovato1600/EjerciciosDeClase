/**
 * @author Antonio Espínola Ramírez
 */
class Perro extends Mamifero {
    // Implementación del sonido
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau!");
    }

    // Implementación del movimiento
    @Override
    public void moverse() {
        System.out.println("El perro corre alegremente.");
    }

    // Implementación de mostrar especie
    @Override
    public void mostrarEspecie() {
        System.out.println("Este es un Perro.");
    }

    // Metodo específico de Perro
    public void moverCola() {
        System.out.println("El perro está moviendo la cola.");
    }
}
