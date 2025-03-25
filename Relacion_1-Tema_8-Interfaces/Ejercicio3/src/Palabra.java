/**
 * @author Antonio Espinola Ramirez
 */

public class Palabra implements Ordenable{

    //Atributos
    private String palabra;


    //Constructor
    public Palabra(String palabra) {
        this.palabra = palabra;
    }


    @Override
    public int comparar(String obj1) {
        if (palabra.length() > obj1.length()) {
            return -1;
        }
        if (palabra.length() < obj1.length()) {
            return 1;
        }
        return 0; //Si tienen la misma longuitud de vuelve 0
    }
    public int longitudPalabra (){
        return palabra.length();
    }

    @Override
    public int comparar(Palabra obj1) {
        if (palabra.length() > obj1.longitudPalabra()) {
            return -1;
        }
        if (palabra.length() < obj1.longitudPalabra()) {
            return 1;
        }
        return 0; //Si tienen la misma longuitud de vuelve 0
    }
}
