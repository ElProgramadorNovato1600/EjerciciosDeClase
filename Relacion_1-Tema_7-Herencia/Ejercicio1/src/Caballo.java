/**
 * @author Antonio Espínola Ramírez
 */

public class Caballo extends Animal {

    //Atributos
    private String raza;

    //Constructor
    public Caballo(String nombre, String especie, String raza) {
        super(nombre, especie);
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println("El caballo esta comiendo");
    }

    @Override
    public void moverse() {
        System.out.println("El caballo esta galopando");
    }
}
