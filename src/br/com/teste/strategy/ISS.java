package br.com.teste.strategy;

public class ISS implements Imposto {

    @Override
    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
