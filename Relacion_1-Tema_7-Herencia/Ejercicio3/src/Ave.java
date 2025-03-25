/**
 * @author Antonio Espínola Ramírez
 */
abstract non-sealed class Ave extends Animal {
    // Metodo para volar
    public void volar() {
        System.out.println("Este ave está volando.");
    }

    // Metodo para mostrar la especie de ave
    @Override
    public abstract void mostrarEspecie();
}
