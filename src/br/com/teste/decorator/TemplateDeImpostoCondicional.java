package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    @Override
    public final double calcula(final Orcamento orcamento) {
        if (this.deveUsarMaximaTaxacao(orcamento)) {
            return this.maximaTaxacao(orcamento) + this.calculoDoOutroImposto(orcamento);
        } else {
            return this.minimaTaxacao(orcamento) + this.calculoDoOutroImposto(orcamento);
        }
    }

    protected abstract boolean deveUsarMaximaTaxacao(final Orcamento orcamento);

    protected abstract double minimaTaxacao(final Orcamento orcamento);

    protected abstract double maximaTaxacao(final Orcamento orcamento);


}
