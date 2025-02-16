
/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el problema de elegir la paleta
     de colores que vamos a utilizar en nuestra decoración. Existe una solución, algo atrevida, que consiste en utilizar
     colores al azar.

     Diseña la clase Colores, que alberga por defecto una serie de colores (mediante una cadena), aunque es posible añadir
     tantos como necesitemos. La clase tendrá un metodo que devuelve una tabla con los n colores que necesitamos elegidos
     al azar sin repeticiones*/
    public static void main(String[] args) {

        //Creamos objeto
        Colores paleta = new Colores();

        //Mostramos por defecto el objeto
        paleta.mostrarColores();

        //Agregamos un nuevo color y lo mostramos
        paleta.anadirColor("cian");
        paleta.mostrarColores();

        //Pedimos una nueva paleta de 5 colores aleatorios
        String[] paletaAleatoria = paleta.tablaColoresAleatorios(5);
        System.out.println("Paleta de 5 colores aleatorios ");
        for (String color : paletaAleatoria) {
            System.out.println(color + " ");
        }
    }
}