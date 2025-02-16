import java.util.Arrays;
import java.util.Random;

/**
 * @author Antonio Espínola Ramírez
 */

public class Colores {
    private String[] colores;
    private int cantidadColores;

    // Constructor por defecto
    public Colores() {
        this.colores = new String[10];
        this.colores[0] = "Rojo";
        this.colores[1] = "Azul";
        this.colores[2] = "Verde";
        this.colores[3] = "Amarillo";
        this.colores[4] = "Naranja";
        this.colores[5] = "Violeta";
        this.colores[6] = "Rosa";
        this.colores[7] = "Marrón";
        this.colores[8] = "Negro";
        this.colores[9] = "Blanco";
        this.cantidadColores = 10; // Inicialmente hay 10 colores
    }

    /**
     * Metodo que añade un nuevo color en el caso de que no exista, agrandando el array
     *
     * @param color color introducido
     */
    public void anadirColor(String color) {
        // Comprobar si el color ya existe
        for (int i = 0; i < cantidadColores; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                return; // Si ya existe no añade ningun color
            }
        }

        // Si el array está lleno, se agrandara
        if (cantidadColores == colores.length) {
            colores = Arrays.copyOf(colores, colores.length + 1); // Aumentamos el tamaño +1 color
        }

        // agregamos el nuevo color
        colores[cantidadColores] = color;
        cantidadColores++;
    }

    /**
     * Metodo que devuelve una paleta de n colores aleatorios
     *
     * @param numeroColores cantidad de colores
     * @return Devuelve un array con la paleta de colores
     */
    public String[] tablaColoresAleatorios(int numeroColores) {
        String[] coloresAleatorios = new String[numeroColores];
        Random random = new Random();
        boolean[] usados = new boolean[cantidadColores]; // Para evitar que se repitan

        for (int i = 0; i < numeroColores; i++) {
            int indice;
            do {
                indice = random.nextInt(cantidadColores);
            } while (usados[indice]); // Si ya fue usado, busca otro

            coloresAleatorios[i] = colores[indice];
            usados[indice] = true; // Marcar como usado
        }
        return coloresAleatorios;
    }

    /**
     * Muesta los colores disponibles
     */
    public void mostrarColores() {
        System.out.print("Colores disponibles: ");
        for (int i = 0; i < cantidadColores; i++) {
            System.out.print(colores[i] + " ");
        }
        System.out.println();
    }
}
