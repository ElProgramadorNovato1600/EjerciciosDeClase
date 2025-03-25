/**
 * @author Antonio Espínola Ramírez
 */

public sealed abstract class Animal permits Ave, Lagarto, Mamifero {
    // Metodo abstracto para hacer un sonido
    public abstract void hacerSonido();

    // Metodo abstracto para moverse
    public abstract void moverse();

    // Metodo para mostrar la especie
    public abstract void mostrarEspecie();
}
