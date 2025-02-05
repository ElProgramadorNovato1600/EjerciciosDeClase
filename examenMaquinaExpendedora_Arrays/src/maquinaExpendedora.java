
/*
 * @author Antonio Espínola Ramírez
 * */

import java.util.Scanner;

public class maquinaExpendedora {

    /*Se quiere hacer un programa para coger productos de una máquina
     expendedora. Solamente hay un producto en cada posición de la máquina. El
     cliente tiene que elegir un producto de los que tiene la máquina y, si hay de ese
     producto, se escribirá un mensaje indicando “Su producto, gracias” y si no se
     dispone de ese producto, indicar “se ha agotado el producto”.*/

    public static void main(String[] args) {
        String[][] productos = new String[4][3];
        String[][] listaProductos = new String[][]{
                {"Kinder bueno", "monster", "te"},
                {"cafe", "capuchino", "sandwich"},
                {"conguitos", "agua chica", "agua grande"},
                {"coca cola", "fanta limón", "fanta naranja"}};
        Scanner teclado = new Scanner(System.in);
        int fila;
        int columna;

        //Rellenamos la maquina de productos (inicializamos el array)
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length - 1; j++) {
                productos[i][j] = listaProductos[i][j];
            }
        }

        //Preguntamos al cliente el producto que quiere
        //obtenemos la posicion del producto
        System.out.println("Elije un producto de la maquina");
        System.out.println("Inserte codigo:");
        System.out.println("Fila:");
        fila = teclado.nextInt();
        System.out.println("Columna:");
        columna = teclado.nextInt();

        //Utilizamos el trim() para eliminar cualquier espacio en blanco
        //Utilizamos isEmpty para comprobar que esta vacio el string (los espacios en blanco cuentan como caracteres)
        if (!productos[fila][columna].trim().isEmpty()) {
            System.out.println("Su producto gracias");
        } else {
            System.out.println("Se ha agotado el producto");
        }
    }
}
