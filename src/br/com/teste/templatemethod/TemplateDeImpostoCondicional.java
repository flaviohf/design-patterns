package br.com.teste.templatemethod;

import br.com.teste.decorator.Imposto;
import br.com.teste.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional() {
    }

    public TemplateDeImpostoCondicional(final Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public final double calcula(final Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract boolean deveUsarMaximaTaxacao(final Orcamento orcamento);

    protected abstract double minimaTaxacao(final Orcamento orcamento);

    protected abstract double maximaTaxacao(final Orcamento orcamento);


}
