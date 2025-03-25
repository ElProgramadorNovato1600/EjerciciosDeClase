/**
 * @author Antonio Espinola Ramirez
 */

public class ConductorAutobus implements Conductor{

    //Atributos
    private String nombre;

    //Constructor
    public ConductorAutobus(String nombre) {
        this.nombre = nombre;
    }

    //Getter del nombre del conductor
    public String getNombre() {
        return nombre;
    }

    @Override
    public void conducir() {
        System.out.println(this.nombre+" esta conduciendo el autobus");
    }
}
