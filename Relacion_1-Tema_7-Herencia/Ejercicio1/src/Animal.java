/**
 * @author Antonio Espínola Ramírez
 */

public abstract class Animal {

    //Atributos
    private String nombre;
    private String especie;

    //Constructor
    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public abstract void comer();
    public abstract void moverse();
}
