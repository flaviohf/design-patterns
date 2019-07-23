package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;
import br.com.teste.templatemethod.TemplateDeImpostoCondicional;

public class ICPP extends TemplateDeImpostoCondicional {

    @Override
    public boolean deveUsarMaximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double minimaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }
}
