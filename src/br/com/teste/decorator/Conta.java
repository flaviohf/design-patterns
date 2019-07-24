package br.com.teste.decorator;

import java.util.Calendar;

public class Conta {

    private double saldo;

    private Calendar dataAbertura;

    public Calendar getDataAbertura() {
        return this.dataAbertura;
    }

    public void deposita(final double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
