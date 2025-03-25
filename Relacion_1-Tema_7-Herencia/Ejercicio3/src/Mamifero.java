/**
 * @author Antonio Espínola Ramírez
 */
abstract non-sealed class Mamifero extends Animal {
    // Metodo para amamantar
    public void amamantar() {
        System.out.println("Este mamífero está amamantando.");
    }

    // Metodo para mostrar la especie de mamífero
    @Override
    public abstract void mostrarEspecie();
}
