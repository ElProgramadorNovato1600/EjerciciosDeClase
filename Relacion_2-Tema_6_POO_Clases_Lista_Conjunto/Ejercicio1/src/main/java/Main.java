/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodosç
      para incrementar la página leída, para obtener información de la última página que se ha leído y para comenzar
      desde el principio una nueva lectura del mismo libro*/

    public static void main(String[] args) {

        //Creamos el objeto
        MarcaPagina marcaPagina = new MarcaPagina();

        System.out.println("Pagina actual: " + marcaPagina.getPaginaActual()); //imprime 1

        //Avanza dos paginas
        marcaPagina.avanzarPagina();
        marcaPagina.avanzarPagina();

        System.out.println("Pagina actual: " + marcaPagina.getPaginaActual()); //Imprime 3

        marcaPagina.reiniciarLectura(); //Regresa a la primera pagina

        System.out.println("Pagina actual despues de reiniciar: " + marcaPagina.getPaginaActual());// imprime 1
    }
}