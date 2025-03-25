/**
 * @author Antonio Espinola Ramirez
 */

public class Zoologico implements AnimalesRegistrados {

    //Atributos
    private final String nombreZoologico;
    private final Animal[] animales = new Animal[100]; //100 animales por zoologico
    private int contadorAnimales = 0;

    //Constructor
    public Zoologico(String nombreZoologico) {
        this.nombreZoologico = nombreZoologico;
    }

    //Getter
    public String getNombreZoologico() {
        return nombreZoologico;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    /**
     * Metodo para añadir animales
     *
     * @param animalNuevo animal nuevo
     */
    public void agregarAnimales(Animal animalNuevo) {
        animales[contadorAnimales] = animalNuevo;
        contadorAnimales++;
    }

    /**
     * Muestra los animales registrados en el zoologico
     */
    @Override
    public void mostrarAnimalesRegistrados() {
        for (int i = 0; i < contadorAnimales; i++) {
            if (animales[i] != null) {
                System.out.println(animales[i].toString()+"\n");

            }
        }
    }

    //To String
    @Override
    public String toString() {
        return "Zoologico: " + nombreZoologico + "\n";
    }
}