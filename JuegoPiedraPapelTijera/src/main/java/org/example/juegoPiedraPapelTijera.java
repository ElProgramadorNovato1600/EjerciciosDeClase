package org.example;

import java.util.Random;

public class juegoPiedraPapelTijera {

    /*Realiza el juego de "piedra, papel y tijera" utilizando funciones, array y String.*/

    public static void main(String[] args) {
        String[] eleccion = {"Piedra", "Papel", "Tijera"};
        String maquina = "Boss final";
        int eleccionMaquina;
        String eleccionJugadorString;
        Random random = new Random();
        String jugador = LeerDatosEntrada.leerString("Introduce tu nombre jugador");

        System.out.println("Bienvenido " + jugador + " te enfrentaras al gradioso e inagualable " + maquina);

        //Decision de la maquina aleatorio
        eleccionMaquina = random.nextInt(0, 2); //0 = Piedra, 1 = Papel y 2 = Tijera.

        //Pedimos al jugador su elección "Piedra", "Papel" y "Tijera"
        //Si el jugador escribe algo diferente se le volvera a preguntar
        do {
            eleccionJugadorString = LeerDatosEntrada.leerString("Elije una opcion " + jugador + " `Piedra´ `Papel´ `Tijera´");
        } while (!eleccionJugadorString.equalsIgnoreCase(eleccion[0]) && !eleccionJugadorString.equalsIgnoreCase(eleccion[1]) && !eleccionJugadorString.equalsIgnoreCase(eleccion[2]));


        //Se comprueba si el jugador y la maquina han empatado
        //Si no hay empate se dirá quien de los dos ha ganado y la partida termina
        if (!empate(eleccionMaquina, eleccionJugadorString, eleccion)) {
            if (ganador(eleccionMaquina, eleccionJugadorString, eleccion)) {
                System.out.println("El jugador " + jugador + " ha ganado");
                System.out.println(jugador + " " + eleccionJugadorString.toLowerCase());
                System.out.println(maquina + " " + eleccion[eleccionMaquina]);
            } else {
                System.out.println("La maquina " + maquina + " ha ganado");
                System.out.println(jugador + " " + eleccionJugadorString.toLowerCase());
                System.out.println(maquina + " " + eleccion[eleccionMaquina]);
            }
        } else {
            System.out.println("\tEmpate");
            System.out.println(jugador + " " + eleccionJugadorString);
            System.out.println(maquina + " " + eleccion[eleccionMaquina]);
        }
    }

    /**
     * @param decision Posicion del Array String
     * @param eleccion Array de String
     * @return Devuelve un String Piedra Papel o Tijera
     */
    public static String decision(int decision, String[] eleccion) {
        return eleccion[decision];
    }

    /**
     * Comprueba si hay empate o no
     * @param eleccionMaquina Eleccion de la maquina
     * @param eleccionJugador Eleccion del jugador
     * @param eleccion Array de String
     * @return Devuelve true si hay empate
     */
    public static boolean empate(int eleccionMaquina, String eleccionJugador, String[] eleccion) {
        boolean empate = false;
        String eleccionMaquinaString = decision(eleccionMaquina, eleccion);
        if (eleccionMaquinaString.equalsIgnoreCase(eleccionJugador)) {
            empate = true;
        }
        return empate;
    }

    /**
     * Comprueba quien ha ganado, si el jugador o la maquina
     * @param eleccionMaquina Eleccion de la maquina
     * @param eleccionJugador Eleccion del jugador
     * @param eleccion Array de String
     * @return Devuelve true si el jugador gana, y devolvera false si la maquina gana
     */
    public static boolean ganador(int eleccionMaquina, String eleccionJugador, String[] eleccion) {
        boolean ganador = false;
        String eleccionMaquinaString = decision(eleccionMaquina, eleccion);

        if (eleccionMaquinaString.equals("tijera") && eleccionJugador.equalsIgnoreCase("piedra")) {
            ganador = true;
        }
        if (eleccionMaquinaString.equals("papel") && eleccionJugador.equalsIgnoreCase("tijera")) {
            ganador = true;
        }
        if (eleccionMaquinaString.equals("piedra") && eleccionJugador.equalsIgnoreCase("papel")) {
            ganador = true;
        }
        return ganador;
    }
}