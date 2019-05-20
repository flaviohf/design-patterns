package br.com.teste.strategy;

public class ICMS implements Imposto {

    @Override
    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
