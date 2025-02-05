
/*
 * @author Antonio Espínola Ramírez
 * */

import java.util.Scanner;

public class maquinaExpendedora4 {

    /*Crear una función para el ejercicio anterior para que se muestren todos los productos disponibles en 
    cada una de las posiciones del expendedor. Si no hay producto en esa posición también se indicará.*/

    public static void main(String[] args) {
        String[][] productos = new String[4][3];
        String[][] listaProductos = new String[][]{
                {"Kinder bueno", "monster", "te"},
                {"cafe", "capuchino", "sandwich"},
                {"conguitos", "agua chica", "agua grande"},
                {"coca cola", "fanta limón", "fanta naranja"}};
        int[][] precioProductos = new int[][]{
                {2, 1, 5},
                {2, 3, 4},
                {3, 1, 2},
                {1, 1, 1}};
        Scanner teclado = new Scanner(System.in);
        int fila;
        int columna;
        String nombreProducto;

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
            productos[fila][columna] = ""; //Quitamos el producto
        } else {
            System.out.println("Se ha agotado el producto");
        }


        //Pedimos nombre de un producto
        System.out.println("Rellenamos maquina");
        System.out.println("Nombre del producto faltante");
        nombreProducto = teclado.nextLine();
        nombreProducto = teclado.nextLine().toLowerCase();

        //Obtengo la posicion
        //Si no existe devuelve -1
        fila = posicionFilaProducto(listaProductos, nombreProducto);
        columna = posicionColumnaProducto(listaProductos, nombreProducto);

        //Si existe el producto y no esta en la maquina se rellenara
        if (fila != 1 && columna != -1) {
            if (productos[fila][columna].trim().isEmpty()) {
                productos[fila][columna] = nombreProducto;
            }
        } else {
            System.out.println("Lo sentimos pero no disponemos de este producto ");
        }

        //Añadir el precio de los productos a los productos (Punto 3 del examen)
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length - 1; j++) {
                productos[i][j] = productos[i][j] + " " + precioProductos[i][j];
            }
        }

        //Muestro los productos de la maquina y los que no estan se indican
        if (fila != -1 && columna != -1) {
            muestroProductos(productos, listaProductos);
        }

    }

    /**
     * @param listaProductos Array de los productos
     * @param nombreProducto Nombre del producto
     * @return Devuelve la posicion de la fila del producto o Devuelve -1 si no encuentra el producto
     */
    public static int posicionFilaProducto(String[][] listaProductos, String nombreProducto) {
        int fila = -1;
        for (int i = 0; i < listaProductos.length; i++) {
            for (int j = 0; j < listaProductos.length - 1; j++) {
                if (nombreProducto.equals(listaProductos[i][j].toLowerCase())) {
                    fila = i;
                    return fila;
                }
            }
        }
        return fila;
    }

    /**
     * @param listaProductos Array de los productos
     * @param nombreProducto Nombre del producto
     * @return Devuelve la posicion de la columna del producto o Devuelve -1 si no encuentra el producto
     */
    public static int posicionColumnaProducto(String[][] listaProductos, String nombreProducto) {
        int columna = -1;
        for (int i = 0; i < listaProductos.length; i++) {
            for (int j = 0; j < listaProductos.length - 1; j++) {
                if (nombreProducto.equals(listaProductos[i][j].toLowerCase())) {
                    columna = j;
                    return columna;
                }
            }
        }
        return columna;
    }


    /**
     * Muestra los productos y ademas te indica que productos no estan
     *
     * @param productos      Array con una lista de productos
     * @param listaProductos Array bidimensional de los productos
     */
    public static void muestroProductos(String[][] productos, String[][] listaProductos) {
        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos.length - 1; j++) {
                if (!productos[i][j].substring(0, productos[i][j].lastIndexOf(" ")).isEmpty()) {
                    System.out.println(productos[i][j].substring(0, productos[i][j].lastIndexOf(" ")));
                } else {
                    System.out.println("Este producto \"" + listaProductos[i][j] + "\" no esta disponible");
                }
            }
        }
    }
}
