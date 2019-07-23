package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

import static java.util.Objects.isNull;

public abstract class Imposto {

    protected Imposto outroImposto;

    public Imposto() {
    }

    public Imposto(final Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(final Orcamento orcamento);

    protected double calculoDoOutroImposto(final Orcamento orcamento) {
        if (isNull(this.outroImposto)) {
            return 0;
        }
        return this.outroImposto.calcula(orcamento);
    }
}
