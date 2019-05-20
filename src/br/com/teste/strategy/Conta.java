package br.com.teste.strategy;

public class Conta {

    private double saldo;

    public void deposita(final double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
