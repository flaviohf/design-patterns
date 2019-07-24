package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto() {
    }

    public ImpostoMuitoAlto(final Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
    }
}
