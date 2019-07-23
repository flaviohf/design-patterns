package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public class ISS extends Imposto {

    public ISS() {
    }

    public ISS(final Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + this.calculoDoOutroImposto(orcamento);
    }

}
