/**
 * @author Antonio Espinola Ramirez
 */

public class CuentaDeInversion implements OperacionBancarias{
    private double saldo;

    public CuentaDeInversion(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha depositado " + cantidad + "\nNuevo saldo: " + saldo);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + "\nNuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar " + cantidad);
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo de la cuenta corriente: " + saldo);
    }
}

