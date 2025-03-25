/**
 * @author Antonio Espinola Ramirez
 */

import java.util.Random;
import java.text.DecimalFormat;

public class CuentaCorriente {
    private final String numeroCuenta;
    private double saldo;

    //Constructor con el saldo a 0
    public CuentaCorriente() {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = 0.0;
    }

    //Constructor con un saldo inicial
    public CuentaCorriente(double saldoInicial) {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = saldoInicial;
    }

    private String generarNumeroCuenta() {
        Random rand = new Random();
        long numero = 1000000000L + (long) (rand.nextDouble() * 9000000000L);
        return String.valueOf(numero);
    }

    public void ingreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void cargo(double cantidad) {
        saldo -= cantidad; // Se permite saldo negativo
    }

    public void transferencia(CuentaCorriente destino, double cantidad) {
        if (cantidad > 0) {
            this.cargo(cantidad);
            destino.ingreso(cantidad);
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Número de cta: " + numeroCuenta + " Saldo: " + df.format(saldo) + " €";
    }
}