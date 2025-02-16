/**
 * @author Antonio Espínola Ramírez
 */

public class Main {

    /*Una cola es otra estructura dinámica como la pila, donde los elementos, en vez de apilarse y desapilarse, se
    encolan y desencolan. La diferencia con las pilas es que se desencola el primer elemento encolado, ya que así es
    como funcionan las colas del autobús o del cine. El primero que llega es el primero que sale de la cola
    (vamos a suponer que nadie se cuela). Por tanto, los elementos se encolan y desenclan en extremos opuestos de la
    estructura, llamados primero (el que está primero y será el próximo en abandonar la cola) y último (el que llegó último).
    Implementa la clase cola donde los elementos Integer encolados se guardan en una tabla.
    */

    public static void main(String[] args) {

        Cola cola1 = new Cola(5); //Creo la cola con una capacidad de 5 elementos

        //Elementos de la cola
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);
        cola1.encolar(4);
        cola1.encolar(5);
        cola1.mostrarCola(); //Muestro la cola
        System.out.println("Elemento al frente de la cola "+cola1.frente());
        System.out.println("Tamaño de la cola actual " + cola1.tamano());//Muestro tamaño cola
        System.out.println();

        cola1.desencolar();//Deseencolamos el primer elemento
        cola1.mostrarCola();//Muestro la cola
        System.out.println("Tamaño de la cola actual " + cola1.tamano());//Muestro tamaño cola
        System.out.println("Elemento al frente de la cola "+cola1.frente());
        System.out.println();

        cola1.encolar(1);//Encolo un elemento
        cola1.mostrarCola();//Muestro una cola
        System.out.println("Elemento al frente de la cola "+cola1.frente());
    }
}