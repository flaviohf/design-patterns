package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public class ICMS extends Imposto {

    public ICMS() {
    }

    public ICMS(final Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + this.calculoDoOutroImposto(orcamento);
    }

}
