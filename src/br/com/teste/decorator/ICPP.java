package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP() {
    }

    public ICPP(final Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public boolean deveUsarMaximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double minimaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
    }

    @Override
    public double maximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
    }
}
