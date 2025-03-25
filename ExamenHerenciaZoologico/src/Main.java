/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        //Creo tres animales diferentes
        Animal zorro = new AnimalTerrestre("Zorro", "mamifero", "caminar");
        Animal pelicano = new AnimalVolador("pelicano", "pajaro", "volar");
        Animal pezLuna = new AnimalAcuatico("Pez Luna", "pecado", "nadar");

        //Agrego habilidades
        pelicano.agregarHabilidad("caminar");
        pelicano.agregarHabilidad("nadar");

        // Creo el zoologico
        Zoologico colombia = new Zoologico("zooColombia");

        //  Agrego animales al zoologico
        colombia.agregarAnimales(zorro);
        colombia.agregarAnimales(pelicano);
        colombia.agregarAnimales(pezLuna);

        //Muestro los animales del zoologico
        colombia.mostrarAnimalesRegistrados();
    }
}