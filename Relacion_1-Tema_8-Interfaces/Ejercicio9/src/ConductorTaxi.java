/**
 * @author Antonio Espinola Ramirez
 */

public class ConductorTaxi implements Conductor {
    //Atributos
    private String nombre;

    //Constructor
    public ConductorTaxi(String nombre) {
        this.nombre = nombre;
    }

    //Getter del nombre del conductor
    public String getNombre() {
        return nombre;
    }

    @Override
    public void conducir() {
        System.out.println(this.nombre+" esta conduciendo el taxi");
    }
}
