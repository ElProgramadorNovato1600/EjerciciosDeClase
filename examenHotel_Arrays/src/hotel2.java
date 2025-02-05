
/*
 * @author Antonio Espínola Ramírez
 * */

import java.util.Scanner;

public class hotel2 {

    /*Modifica el programa anterior para que además de poner la habitación como
      ocupada guarde el nombre del cliente que hay en la habitación.*/

    public static void main(String[] args) {
        //creamos un array booleano de 4x4 (4 plantas 4 habitaciones)
        boolean[][] habitaciones = new boolean[4][4];
        //creamos un array para los nombres de los clientes
        String[][] clientes = new String[4][4];
        Scanner teclado = new Scanner(System.in);
        int[] indicePlanta = {4, 3, 2, 1}; //Representacion de las plantas de un hotel
        int planta;
        int[] indiceHabitacion = {1, 2, 3, 4};//Representacion de las habitaciones de un hotel
        int habitacion;
        boolean plantaLibre = false;
        boolean reserva = false;
        String nombreCliente;


        //inicializamos el array boleano a false (ninguna habitacion ocupada)
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones.length; j++) {
                habitaciones[i][j] = false;
            }
        }
        // inicializamos el array String a habitacion libre
        for (int i = 0; i < clientes.length; i++) {
            for (int j = 0; j < clientes.length; j++) {
                clientes[i][j] = "habitacion libre";
            }
        }

//        Pruebas

//        habitaciones[0][0] = true;
//        habitaciones[0][1] = true;
//        habitaciones[0][2] = true;
//        habitaciones[0][3] = true;

        //Compruebo que la planta que elija el usuario no este ocupada si lo esta se le indicara
        // y se le volvera a preguntar en que planta se quiere alojar
        // se le mostraran las habitaciones libres de esa planta
        do {
            System.out.println("En que planta quiere alojarse?1-4");
            planta = teclado.nextInt();
            planta = posicionPlanta(indicePlanta, planta);
            if (planta != -1) {
                for (int i = 0; i < habitaciones.length; i++) {
                    if (!habitaciones[planta][i]) {
                        System.out.println("habitacion libre: " + (i + 1));
                        plantaLibre = true;
                    }
                }
            }
            //Compruebo que la planta exista
            if (planta != -1) {
                //  Compruebo si no hay habitaciones disponibles en la planta
                if (!plantaLibre) {
                    System.out.println("No hay habitaciones disponibles en esta planta");
                }
            } else {
                System.out.println("No existe esa planta");
            }
        } while (!plantaLibre);

        //El usuario elije una de las habitaciones libres de la planta elegida anteriormente
        //en el caso de que este ocupada se le volvera a preguntar
        //si no esta ocupada se marcara como habitacion ocupada
        do {
            System.out.println("Elije la habitacion");
            habitacion = teclado.nextInt();
            habitacion = posicionHabitacion(indiceHabitacion, habitacion);
            if (habitacion != -1) {
                //si esta libre se ocupa
                if (!habitaciones[planta][habitacion]) {
                    habitaciones[planta][habitacion] = true; //Se ha ocupado
                    System.out.println("Dime su nombre por favor");
                    nombreCliente = teclado.nextLine();
                    nombreCliente = teclado.nextLine();
                    clientes[planta][habitacion] = "Habitacion ocupada\n nombre cliente: " + nombreCliente; //añadimos el nombre del cliente a la habitacion ocupada
                    System.out.println("reserva hecha");
                    reserva = true;
                }
            }
            //Compruebo si la habitacion no existe
            if (habitacion != -1) {
                //Compruebo si la habitacion esta ocupada
                if (!reserva) {
                    System.out.println("La habitacion ya esta ocupada");
                }
            } else {
                System.out.println("No existe la habitacion");
            }
        } while (!reserva);
    }

    /**
     * @param indicePlanta Posicion de la habitacion en el array
     * @param numPlanta    Numero de la planta
     * @return Devuelve la posicion de la planta de la planta 1-4 o Delvuelve -1 si no existe la planta
     */
    public static int posicionPlanta(int[] indicePlanta, int numPlanta) {
        int posicionPlanta = -1;
        for (int i = 0; i < indicePlanta.length; i++) {
            if (indicePlanta[i] == numPlanta) {
                posicionPlanta = i;
            }
        }
        return posicionPlanta;
    }

    /**
     * @param indiceHabitacion Posicion de la habitacion en el array
     * @param numHabitacion    Numero de la habitacion
     * @return Devuelve la posicion de la planta de la habitacion 1-4 o Devuelve -1 si no existe la habitacion
     */
    public static int posicionHabitacion(int[] indiceHabitacion, int numHabitacion) {
        int posicionHabitacion = -1;
        for (int i = 0; i < indiceHabitacion.length; i++) {
            if (indiceHabitacion[i] == numHabitacion) {
                posicionHabitacion = i;
            }
        }
        return posicionHabitacion;
    }
}
