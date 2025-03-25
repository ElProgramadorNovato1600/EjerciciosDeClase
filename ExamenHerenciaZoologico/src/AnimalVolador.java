/**
 * @author Antonio Espinola Ramirez
 */

public class AnimalVolador extends Animal {

    protected final String tipoAnimal;

    //Constructor
    public AnimalVolador(String nombre, String especie, String habilidad) {
        super(nombre, especie, habilidad);
        this.tipoAnimal = "VOLADOR";
    }

    //To String
    @Override
    public String toString() {
        return "Tipo animal: "+tipoAnimal+"\n"+super.toString();
    }

}