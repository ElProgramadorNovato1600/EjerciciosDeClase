/**
 * @author Antonio Espínola Ramírez
 */

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada clase
        Gato gato = new Gato();
        Perro perro = new Perro();
        Canario canario = new Canario();
        Pinguino pinguino = new Pinguino();
        Lagarto lagarto = new Lagarto();

        // Probar los métodos de cada objeto
        System.out.println("Gato:");
        gato.mostrarEspecie();
        gato.hacerSonido();
        gato.moverse();
        gato.ronronear();
        System.out.println();

        System.out.println("Perro:");
        perro.mostrarEspecie();
        perro.hacerSonido();
        perro.moverse();
        perro.moverCola();
        System.out.println();

        System.out.println("Canario:");
        canario.mostrarEspecie();
        canario.hacerSonido();
        canario.moverse();
        canario.cantar();
        System.out.println();

        System.out.println("Pingüino:");
        pinguino.mostrarEspecie();
        pinguino.hacerSonido();
        pinguino.moverse();
        pinguino.deslizarse();
        System.out.println();

        System.out.println("Lagarto:");
        lagarto.mostrarEspecie();
        lagarto.hacerSonido();
        lagarto.moverse();
        lagarto.tomarSol();
    }
}