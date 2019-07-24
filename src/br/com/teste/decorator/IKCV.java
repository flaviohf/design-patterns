package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;
import br.com.teste.templatemethod.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {
    }

    public IKCV(final Imposto outroImposto) {
        super(outroImposto);
    }

    private boolean temItemMaiorQueCemReais(final Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> item.getValue() > 100);
    }

    @Override
    public boolean deveUsarMaximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQueCemReais(orcamento);
    }

    @Override
    public double minimaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
    }

    @Override
    public double maximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
    }
}
