package br.com.teste.strategy;

public class ICCC implements Imposto {

    @Override
    public double calcula(final Orcamento orcamento) {
        final double valor = orcamento.getValor();

        if (valor < 1000) {
            return valor * 0.05;
        } else if (valor >= 1000 && valor <= 3000) {
            return valor * 0.07;
        } else {
            return valor * 0.08 + 30.00;
        }
    }
}
