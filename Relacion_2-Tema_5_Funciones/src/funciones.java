
/*
* @author Antonio Espínola Ramírez
* */

public class funciones {

    //1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
    public static boolean esCapicua(int numero) {
        boolean esCapicua = false;
        String cadena = Integer.toString(numero);//convierte un int a string
        String numeroInvertido = "";
        //invierte el numero cogiendo la ultima posicion
        for (int i = cadena.length() - 1; i >= 0; i--) {
            numeroInvertido = numeroInvertido + cadena.charAt(i);
        }
        if (numeroInvertido.equals(cadena)) {
            esCapicua = true;
        }
        return esCapicua;
    }

    //2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
    //es primo y falso en caso contrario.
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        if (numero <= 1) {
            esPrimo = false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    //3. siguientePrimo: Devuelve el menor primo que es mayor al número que
    //se pasa como parámetro.
    public static int siguientePrimo(int n) {
        int siguientePrimo = n + 1;
        while (!esPrimo(siguientePrimo)) {
            siguientePrimo++;//se incrementa hasta que se obtenga el siguiente primo mayor al del parametro
        }
        return siguientePrimo;
    }

    //4. potencia: Dada una base y un exponente devuelve la potencia.
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    //5. digitos: Cuenta el número de dígitos de un número entero.
    public static int digitos(int numero) {
        String digitos = Integer.toString(numero);
        return digitos.length();
    }

    //6. voltea: Le da la vuelta a un número.
    public static int voltea(int numero) {
        String cadena = Integer.toString(numero);//convierte un int a string
        String numeroInvertido = "";
        //invierte el numero cogiendo la ultima posicion
        for (int i = cadena.length() - 1; i >= 0; i--) {
            numeroInvertido = numeroInvertido + cadena.charAt(i);
        }
        numero = Integer.parseInt(numeroInvertido);//Convierte String a int
        return numero;
    }

    //7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
    //Se empieza contando por el 0 y de izquierda a derecha.
    public static int digitoN(int numero, int posicion) {
        String numeroString = Integer.toString(numero);
        return numeroString.charAt(posicion);
    }

    //8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
    //dentro de un número entero. Si no se encuentra, devuelve -1.
    public static int posicionDeDigito(int numero, int digito) {
        int posicion = 0;
        int digitoActual = 0;
        if (digito < 0 || digito > 9) {
            return -1;
        }
        while (numero > 0) {
            digitoActual = numero % 10; // Extrae el último dígito

            if (digitoActual == digito) {
                return posicion; // Retorna la posición si coincide con el dígito buscado
            }

            numero /= 10; // Eliminar el último dígito
            posicion++; // Aumentar la posición
        }
        // Si no se encuentra el dígito, devolver -1
        return -1;
    }

    //9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
    //derecha).
    public static int quitaPorDetras(int numero, int digitos) {
        for (int i = 0; i < digitos; i++) {
            numero = numero / 10;
        }
        return numero;
    }

    //10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
    //izquierda).
    public static int quitaPorDelante(int numero, int digitos) {
        String numeroString = Integer.toString(numero);
        //Con el metodo substring quito letras a partir de un posicion
        //luego paso de String a int con parseInt
        numero = Integer.parseInt(numeroString.substring(digitos));
        return numero;
    }

    //11. pegaPorDetras: Añade un dígito a un número por detrás.
    public static int pegaPorDetras(int numero, int nuevoDigito) {
        String numeroString = Integer.toString(numero);
        //Si el digito introducido no es un solo digito devolvera el numero introducido sin modificar
        String digitoString;
        if (nuevoDigito >= 0 && nuevoDigito <= 9) {
            digitoString = Integer.toString(nuevoDigito);
        } else {
            return numero;
        }
        numero = Integer.parseInt(numeroString + digitoString);
        return numero;
    }

    //12. pegaPorDelante: Añade un dígito a un número por delante.
    public static int pegaPorDelante(int numero, int nuevoDigito) {
        String numeroString = Integer.toString(numero);
        //Si el digito introducido no es un solo digito devolvera el numero introducido sin modificar
        String digitoString;
        if (nuevoDigito >= 0 && nuevoDigito <= 9) {
            digitoString = Integer.toString(nuevoDigito);
        } else {
            return numero;
        }
        numero = Integer.parseInt(digitoString + numeroString);
        return numero;
    }

    //13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
    //dentro de un número y devuelve el trozo correspondiente.
    public static int trozoDeNumero(int numero, int posicionIncial, int posicionFinal) {
        String numeroString = Integer.toString(numero);
        numero = Integer.parseInt(numeroString.substring(posicionIncial, posicionFinal));
        return numero;
    }

    //14. juntaNumeros: Pega dos números para formar uno.
    public static int juntaNumeros(int numero, int numero2) {
        int numeroPegado = 0;
        String numeroString = Integer.toString(numero);
        String numeroString2 = Integer.toString(numero2);
        numeroPegado = Integer.parseInt(numeroString + numeroString2);
        return numeroPegado;
    }

    //Ejercicio 15
    //Muestra los números primos que hay entre 1 y 1000
    public static void muestraPrimos() {
        int numero = 0;
        for (int i = 0; i < 1000; i++) {
            System.out.println(siguientePrimo(numero));
            numero = siguientePrimo(numero);
        }
    }

    //Ejercicio 16
    //Muestra los números capicúa que hay entre 1 y 99999.
    public static void numerosCapicua() {
        for (int i = 1; i <= 99999; i++) {
            if (esCapicua(i)) {
                System.out.println(i + " es capicua");
            }
        }
    }

    //Ejercicio 17
    //Escribe un programa que pase de binario a decimal.
    public static int binario_decimal(String numeroBinario) {
        int decimal = 0;
        int longitud = numeroBinario.length();

        for (int i = 0; i < longitud; i++) {
            // Obtenemos el valor del dígito binario (0 o 1)
            char digito = numeroBinario.charAt(i);

            // compruebo que los digitos sean 0 o 1
            if (digito == '1') {
                // Calculamos el valor decimal de ese dígito
                decimal = decimal * 2 + 1;
            } else if (digito == '0') {
                // Si es 0 se multiplica por 2 para desplazarlo a la izquierda
                decimal = decimal * 2;
            }
        }
        return decimal;
    }
}
