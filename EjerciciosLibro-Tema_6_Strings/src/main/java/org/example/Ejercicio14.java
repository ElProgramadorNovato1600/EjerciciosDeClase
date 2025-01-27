package org.example;

/*
 * @author Antonio Espínola Ramírez
 * */

public class Ejercicio14 {

    /*Diseña una aplicación que se comporte como una pequeña agenda. Mediante un menú el usuario podrá elegir entre:
     a) Añadir un nuevo contacto (nombre y teléfono).
     b) Buscar el teléfono de un contacto a partir de su nombre.
     c) Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre.*/

    public static void main(String[] args) {
        int opcion;
        int numeroContactos = 0;
        String[] nombreTelefono = new String[10];

        do {
            menu();
            opcion = LeerDatosEntrada.leerEnteroConRango("Introduce una opcion 1-4", 1, 4);
            switch (opcion) {
                case 1:
                    nombreTelefono[numeroContactos] = LeerDatosEntrada.leerString("Escribe el nombre seguido del telefono \"nombre:telefono\"");
                    numeroContactos++;
                    break;
                case 2:
                    String nombreContacto = LeerDatosEntrada.leerString("Introduce el nombre del contacto para obtener su numero de telefono");
                    System.out.println(buscarTelefono(nombreTelefono, numeroContactos, nombreContacto));
                    break;
                case 3:
                    mostrarContactosOrdenados(nombreTelefono, numeroContactos);
                    break;
            }
        } while (opcion != 4);


    }

    //Menu
    public static void menu() {
        System.out.println("1.-Añadir un nuevo contacto (nombre y telefono)");
        System.out.println("2.-Buscar el telefono de un contacto a partir de su nombre");
        System.out.println("3.-Mostrar la informacion de todos los contactos ordenadors alfabeticamente mediante el nombre");
        System.out.println("4.-Salir");
    }

    // Ordenar los contactos alfabéticamente por nombre
    public static void mostrarContactosOrdenados(String[] contactos, int nombre) {
        for (int i = 0; i < nombre - 1; i++) {
            for (int j = 0; j < nombre - i - 1; j++) {
                if (contactos[j].split(":")[0].compareToIgnoreCase(contactos[j + 1].split(":")[0]) > 0) {
                    // ordenar contactos
                    String aux = contactos[j];
                    contactos[j] = contactos[j + 1];
                    contactos[j + 1] = aux;
                }
            }
        }
        // Mostrar los contactos ordenados
        for (int i = 0; i < nombre; i++) {
            System.out.println(contactos[i]);
        }
    }

    // Función para buscar el teléfono
    public static String buscarTelefono(String[] contactos, int numeroContactos, String nombreTelefono) {
        String contacto = "Contacto no encontrado";
        for (int i = 0; i < numeroContactos; i++) {
            // Separar el nombre y teléfono por el carácter ':'
            String[] partes = contactos[i].split(":");
            String nombreContacto = partes[0];
            String telefonoContacto = partes[1];

            // Comparar el nombre con el nombre a buscar
            if (nombreContacto.equalsIgnoreCase(nombreTelefono)) {
                contacto = "Teléfono de " + nombreContacto + ": " + telefonoContacto;
            }
        }
        // Si no se encuentra el contacto
        return contacto;
    }
}