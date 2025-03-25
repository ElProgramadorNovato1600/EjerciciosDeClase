/**
 * @author Antonio Espinola Ramirez
 */

import java.util.Random;
import java.text.DecimalFormat;

public class TarjetaRegalo {
    private int numero;
    private double saldo;

    // Constructor que asigna un número aleatorio de 5 dígitos y un saldo inicial
    public TarjetaRegalo(double saldoInicial) {
        this.numero = generarNumero();
        this.saldo = saldoInicial;
    }

    // Metodo para gastar saldo
    public void gasta(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", cantidad);
        } else {
            this.saldo -= cantidad;
        }
    }

    // Metodo para fusionar dos tarjetas
    public TarjetaRegalo fusionaCon(TarjetaRegalo otra) {
        double nuevoSaldo = this.saldo + otra.saldo;
        this.saldo = 0;
        otra.saldo = 0;
        return new TarjetaRegalo(nuevoSaldo);
    }

    // Metodo para generar un número aleatorio de 5 cifras
    private int generarNumero() {
        Random rand = new Random();
        return 10000 + rand.nextInt(90000); // Genera un número entre 10000 y 99999
    }

    // Metodo toString para mostrar la información de la tarjeta
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Tarjeta nº " + String.format("%05d", numero) + " – Saldo " + df.format(saldo) + "€";
    }
}