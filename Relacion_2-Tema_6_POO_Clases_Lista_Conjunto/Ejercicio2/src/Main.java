
/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes pueden indicarse en el
     constructor y modificarse a posteriori. Es fundamental que la clase disponga de un metodo que devuelva las distintas
     soluciones y de un metodo que nos informe si el discriminante es positivo*/

    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1, 2, -8);

        System.out.println("Discriminante: " + ecuacion.getDiscriminante());
        System.out.println("¿Tiene soluciones reales? ");
        if (ecuacion.tieneSolucionesReales()) {
            System.out.println("si");
        }else{
            System.out.println("no");
        }

        double[] soluciones = ecuacion.resolver();
        if (soluciones.length == 0) {
            System.out.println("No hay soluciones reales.");
        } else {
            System.out.println("Soluciones: ");
            System.out.println(soluciones[0]);
            System.out.println(soluciones[1]);
            System.out.println();
        }
    }
}