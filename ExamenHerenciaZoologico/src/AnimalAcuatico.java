/**
 * @author Antonio Espinola Ramirez
 */

public class AnimalAcuatico extends Animal {

    protected final String tipoAnimal;

    //Constructor
    public AnimalAcuatico(String nombre, String especie, String habilidad) {
        super(nombre, especie, habilidad);
        this.tipoAnimal = "ACUATICO";
    }

    //To String
    @Override
    public String toString() {
        return "Tipo animal: "+tipoAnimal+"\n"+super.toString();
    }
}