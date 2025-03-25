/**
 * @author Antonio Espinola Ramirez
 */

import java.util.Scanner;

public class Main {

    /*Queremos gestionar la venta de entradas (no numeradas) de Expocoches
     Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
     nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
     con 25 entradas disponibles. Hay que controlar que existen entradas antes de
     venderlas.*/

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Zona salaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        int opcion;

        do {
            System.out.println("\n1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas disponibles:");
                    System.out.println("Sala Principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Zona Compra-Venta: " + zonaCompraVenta.getEntradasPorVender());
                    System.out.println("Zona VIP: " + zonaVip.getEntradasPorVender());
                    break;

                case 2:
                    System.out.println("\n¿Para qué zona quieres comprar entradas?");
                    System.out.println("1. Sala Principal");
                    System.out.println("2. Zona Compra-Venta");
                    System.out.println("3. Zona VIP");
                    System.out.print("Elige una zona: ");
                    int zonaElegida = teclado.nextInt();

                    System.out.print("¿Cuántas entradas quieres? ");
                    int cantidad = teclado.nextInt();

                    switch (zonaElegida) {
                        case 1:
                            salaPrincipal.vender(cantidad);
                            break;
                        case 2:
                            zonaCompraVenta.vender(cantidad);
                            break;
                        case 3:
                            zonaVip.vender(cantidad);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 3);
    }
}