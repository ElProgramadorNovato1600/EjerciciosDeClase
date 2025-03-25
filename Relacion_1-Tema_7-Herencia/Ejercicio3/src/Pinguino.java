/**
 * @author Antonio Espínola Ramírez
 */
public class Pinguino extends Ave {
    // Implementación del sonido
    @Override
    public void hacerSonido() {
        System.out.println("El pingüino hace: ¡Ahhh!");
    }

    // Implementación del movimiento
    @Override
    public void moverse() {
        System.out.println("El pingüino camina torpemente.");
    }

    // Implementación de mostrar especie
    @Override
    public void mostrarEspecie() {
        System.out.println("Este es un Pingüino.");
    }

    // Metodo específico de Pinguino
    public void deslizarse() {
        System.out.println("El pingüino está deslizándose sobre el hielo.");
    }
}
