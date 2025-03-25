import java.util.Random;

/**
 * @author Antonio Espinola Ramirez
 */

public class Main {

    /*Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
     forma aleatoria, que encajen bien y que estén bien colocadas según el juego
     del dominó. No hay que controlar si se repiten o no las fichas.
     Ejemplo:
     [6|1][1|4][4|4][4| ][ |3][3|2][2|6][6|5]*/

    public static void main(String[] args) {

        Random rand = new Random();
        FichaDomino[] secuencia = new FichaDomino[8]; //Array de 8 fichas de domino

        // Generar la primera ficha de forma aleatoria
        int numIzq = rand.nextInt(7);
        int numDer = rand.nextInt(7);
        secuencia[0] = new FichaDomino(numIzq, numDer);

        //Generar las siguientes fichas asegurando que encajen
        //Obtengo el numero de la derecha de la ficha anterior y la coloco en el lado izquierdo
        //de la siguiente ficha para asegurarme que las fichas encajen
        //El lado derecho sera totalmente aleatorio
        for (int i = 1; i < secuencia.length; i++) {
            int ladoDerechaAnterior = secuencia[i - 1].getNumeroDerecha();
            int nuevoLado = rand.nextInt(7);
            secuencia[i] = new FichaDomino(ladoDerechaAnterior, nuevoLado);
        }

        // Mostrar la secuencia
        for (FichaDomino ficha : secuencia) {
            System.out.print(ficha);
        }
    }
}