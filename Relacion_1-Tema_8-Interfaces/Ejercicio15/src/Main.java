/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {
        // Crear la listaNumeros de números
        Lista listaNumeros = new Lista();
        listaNumeros.insertarFinal(5);
        listaNumeros.insertarFinal(10);
        listaNumeros.insertarFinal(3);
        listaNumeros.insertarFinal(7);

        // Operación suma usando clase anónima
        Operacion suma = new Operacion() {
            @Override
            public int operar(Lista lista) {
                int suma = 0;
                Numeros actual = lista.primero;
                while (actual != null) {
                    suma += actual.getElemento();
                    actual = actual.getSiguiente();
                }
                return suma;
            }
        };

        // Operación producto usando clase anónima
        Operacion producto = new Operacion() {
            @Override
            public int operar(Lista lista) {
                int producto = 1;
                Numeros actual = lista.primero;
                while (actual != null) {
                    producto *= actual.getElemento();
                    actual = actual.getSiguiente();
                }
                return producto;
            }
        };

        // Operación máximo usando clase anónima
        Operacion maximo = new Operacion() {
            @Override
            public int operar(Lista lista) {
                int max = Integer.MIN_VALUE;
                Numeros actual = lista.primero;
                while (actual != null) {
                    if (actual.getElemento() > max) {
                        max = actual.getElemento();
                    }
                    actual = actual.getSiguiente();
                }
                return max;
            }
        };

        // Operación mínimo usando clase anónima
        Operacion minimo = new Operacion() {
            @Override
            public int operar(Lista lista) {
                int min = Integer.MAX_VALUE;
                Numeros actual = lista.primero;
                while (actual != null) {
                    if (actual.getElemento() < min) {
                        min = actual.getElemento();
                    }
                    actual = actual.getSiguiente();
                }
                return min;
            }
        };

        // Realizar operaciones
        System.out.println("Suma: " + suma.operar(listaNumeros));
        System.out.println("Producto: " + producto.operar(listaNumeros));
        System.out.println("Máximo: " + maximo.operar(listaNumeros));
        System.out.println("Mínimo: " + minimo.operar(listaNumeros));
    }
}