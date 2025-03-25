/**
 * @author Antonio Espínola Ramírez
 */
public non-sealed class Lagarto extends Animal {
    // Implementación del sonido
    @Override
    public void hacerSonido() {
        System.out.println("El lagarto hace un sonido suave.");
    }

    // Implementación del movimiento
    @Override
    public void moverse() {
        System.out.println("El lagarto se mueve rápidamente sobre las rocas.");
    }

    // Implementación de mostrar especie
    @Override
    public void mostrarEspecie() {
        System.out.println("Este es un Lagarto.");
    }

    // Metodo específico de Lagarto
    public void tomarSol() {
        System.out.println("El lagarto está tomando el sol.");
    }
}
