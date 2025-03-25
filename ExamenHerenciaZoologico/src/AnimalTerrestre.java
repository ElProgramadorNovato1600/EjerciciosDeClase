/**
 * @author Antonio Espinola Ramirez
 */

public class AnimalTerrestre extends Animal {

    protected final String tipoAnimal;

    //Constructor
    public AnimalTerrestre(String nombre, String especie, String habilidad) {
        super(nombre, especie, habilidad);
        this.tipoAnimal = "TERRESTRE";
    }

    //To string
    @Override
    public String toString() {
        return "Tipo animal: "+tipoAnimal+"\n"+super.toString();
    }
}
