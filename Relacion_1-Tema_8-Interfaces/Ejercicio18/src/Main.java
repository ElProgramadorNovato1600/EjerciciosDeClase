/**
 * @author Antonio Espinola Ramirez
 */

public class Main {
    public static void main(String[] args) {

        // Crear cuentas
        OperacionBancarias cuentaCorriente = new CuentaCorriente(1000);
        OperacionBancarias cuentaAhorros = new CuentaDeAhorros(5000);
        OperacionBancarias cuentaInversion = new CuentaDeInversion(10000);

        // Realizar operaciones en Cuenta Corriente
        System.out.println("Operaciones en Cuenta Corriente:");
        cuentaCorriente.depositar(200);
        cuentaCorriente.retirar(300);
        cuentaCorriente.consultarSaldo();
        System.out.println();

        // Realizar operaciones en Cuenta de Ahorros
        System.out.println("Operaciones en Cuenta de Ahorros:");
        cuentaAhorros.depositar(1000);
        cuentaAhorros.retirar(2000);
        cuentaAhorros.consultarSaldo();
        System.out.println();

        // Realizar operaciones en Cuenta de Inversión
        System.out.println("Operaciones en Cuenta de Inversión:");
        cuentaInversion.depositar(5000);
        cuentaInversion.retirar(15000);
        cuentaInversion.consultarSaldo();
    }
}