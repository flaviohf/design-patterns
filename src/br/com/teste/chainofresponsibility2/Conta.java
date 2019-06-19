package br.com.teste.chainofresponsibility2;

public class Conta {

    private final String titular;
    private final double saldo;

    public Conta(final String titular, final double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
