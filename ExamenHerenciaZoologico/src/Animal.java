/**
 * @author Antonio Espinola Ramirez
 */

public abstract class Animal {

    //Atributos

    private String nombre;
    private String especie;
    private String habilidad; //Habilidad principal
    private String[] habilidades = new String[3];//supongamos que como mucho tendran 3 habilidades como maximo
    private int contadorHabilidades = 0;

    //Constructor
    public Animal(String nombre, String especie, String habilidad) {
        this.nombre = nombre;
        this.especie = especie;
        this.habilidad = habilidad;
        habilidades[0] = habilidad;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabilidad() {
        return habilidad;
    }

    //Setter
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * Metodo que agrega una habilidad del animal (un animal puede tener 1 o mas habilidades, maximo 3)
     *
     * @param habilidadNueva Habilidad agregada
     */
    public void agregarHabilidad(String habilidadNueva) {
        if (contadorHabilidades < 2) {
            habilidades[contadorHabilidades + 1] = habilidadNueva;
            contadorHabilidades++;
        }
    }


    /**
     * @return Devuelve un array de String de las habilidades
     */
    private String mostrarHabilidades() {

        String[] mostrarHabilidadesTotales = new String[contadorHabilidades];
        String habilidadesMostradas = "";

        for (int i = 0; i < mostrarHabilidadesTotales.length +1; i++) {
            if (habilidades[i] != null) {
                habilidadesMostradas += habilidades[i] + " ";
            }
        }
        return habilidadesMostradas;
    }

    //To string
    @Override
    public String toString() {
        return "Animal: " + nombre + "\nEspecie: " + especie + "\nHabilidad/es: " + mostrarHabilidades();
    }
}
