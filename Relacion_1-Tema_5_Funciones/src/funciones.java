
/*
* @author Antonio Espínola Ramírez
* */

public class funciones {

    //1. Crea una función de clase (estática) pública que no reciba nada como
    //parámetro y no devuelva nada.
    public static void primerEjercicio() {

    }

    //2. Crea una función de clase (estática) pública que reciba como parámetro
    //un entero y devuelva ese entero incrementado en 1.
    public static int segundoEjercicio(int numero) {

        return numero + 1;
    }

    //3. Crea una función de clase (estática) pública que reciba dos flotantes y
    //devuelva la suma de los dos.
    public static float tercerEjercicio(float n, float n2) {
        return n + n2;
    }

    //4. Crea un programa que tenga una función estática y pública llamada
    //"ClearScreen", que borre la pantalla dibujando 25 líneas en blanco.
    public static void clearScreen() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    //5. Crea un programa que contenga una función estática y pública llamada
    //"DrawSquare", que dibuje un cuadrado formado por 3 filas con 3 asteriscos
    //cada una.
    public static void drawSquare() {
        for (int i = 0; i < 3; i++) {
            System.out.println("***");
        }
    }

    //6. Crea un programa que tenga una función estática y pública llamada
    //"getCube" que calcule el cubo de un número real (float) que se indique
    //como parámetro. El resultado deberá ser otro número real. Sin usar la
    //función Math.pow()
    public static double getCube(float n) {
        return (n * n * n);
    }

    //7. Crea una función estática y pública "getMinimum" que calcule el menor
    //de dos números enteros que recibirá como parámetros. El resultado será
    //otro número entero.
    public static int getMinimum(int n, int n2) {
        return n > n2 ? n2 : n;
    }

    //8. Crea una función estática y pública llamada "getSign", que reciba un
    //número real, y devuelva un número entero con el valor: -1 si el número es
    //negativo, 1 si es positivo o 0 si es cero.
    public static int getSign(double n) {
        if (n < 0) {
            return -1;
        }
        return 0;
    }

    //9. Crea una función estática y pública "printSquareData" que reciba un
    //número entero y calcule y muestre en pantalla el valor del perímetro y de
    //la superficie de un cuadrado que tenga como lado el número que se ha
    //indicado como parámetro.
    public static void printSquareData(int lado) {
        int perimetro = 4 * lado;
        int area = lado * lado;
        System.out.println("Lado del cuadrado: " + lado);
        System.out.println("Perimetro del cuadrado: " + perimetro);
        System.out.println("Area del cuadrado: " + area);
    }

    //10. Crea una función de clase (estática) pública que reciba dos reales y
    //devuelva el mayor de los dos.
    public static double ejercicio10(double n, double n2) {
        if (n > n2) {
            return n;
        } else {
            return n2;
        }
    }

    //11. Crea una función de clase (estática) pública que reciba dos reales y
    //devuelva el menor de los dos.
    public static double ejercicio11(double n, double n2) {
        if (n < n2) {
            return n;
        } else {
            return n2;
        }
    }

    //12. Crea una función de clase (estática) pública que reciba un entero y
    //devuelva su factorial.
    public static int factorial(int n) {
        int resultado = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
        }
        return resultado;
    }

    //13. Crea una función de clase (estática) pública que reciba un entero y
    //“nos diga” si es primo o no.
    public static void esPrimo(int n) {
        int contador = 0;
        if (n <= 1) {
            contador++;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador != 0) {
            System.out.println("No es primo");
        } else {
            return System.out.println("Es primo");
        }
    }

    //14. Crea una función de clase (estática) pública que reciba dos cadenas y
    //devuelva la concatenación de esas dos cadenas.
    public static String concatenacion(String cadena, String cadena2) {
        return cadena + cadena2;
    }

    //15. Crea una función de clase (estática) pública que reciba un entero y
    //devuelva ese entero si es un número primo o 0 en cualquier otro caso.
    public static int ejercicio15(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return n;
    }

    //16. Crea una función de clase (estática) pública que reciba dos enteros y
    //devuelva el máximo común divisor de los 2
    public static int ejercicio16(int n, int n2) {
        if (n < 0) n = -n;
        if (n2 < 0) n2 = -n2;
        while (n2 != 0) {
            int temp = n2;
            n2 = n % n2;
            n = temp;
        }
        return n;
    }

    //17. Crea una función de clase (estática) pública que reciba un número e
    //imprima por consola la tabla de multiplicar de ese número.
    public static void ejercicio17(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    //18. Crea una función de clase (estática) pública que dado un carácter, diga
    //si se trata de un número o no.
    public static boolean ejercicio18(char numero) {
        return numero >= '0' && numero <= '9';
    }

    //19. Crea una función de clase (estática) pública que calcule la distancia
    //entre dos puntos2d.
    public static int ejercicio19(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //20. Crea una función de clase (estática) pública que calcule el área de un
    //triángulo.
    public static int ejercicio20(int base, int altura) {
        return (base * altura) / 2;
    }

    //21. Crea una función de clase (estática) pública que devuelva el perímetro
    //de un círculo.
    public static double ejercicio21(double radio) {
        return 2 * Math.PI * radio;
    }

}
