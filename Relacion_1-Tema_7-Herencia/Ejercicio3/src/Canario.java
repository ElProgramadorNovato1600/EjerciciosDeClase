/**
 * @author Antonio Espínola Ramírez
 */
public class Canario extends Ave {
    // Implementación del sonido
    @Override
    public void hacerSonido() {
        System.out.println("El canario hace: ¡Pío pío!");
    }

    // Implementación del movimiento
    @Override
    public void moverse() {
        System.out.println("El canario vuela rápidamente.");
    }

    // Implementación de mostrar especie
    @Override
    public void mostrarEspecie() {
        System.out.println("Este es un Canario.");
    }

    // Metodo específico de Canario
    public void cantar() {
        System.out.println("El canario está cantando.");
    }
}
