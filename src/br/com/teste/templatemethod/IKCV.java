package br.com.teste.templatemethod;

import br.com.teste.strategy.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

    private boolean temItemMaiorQueCemReais(final Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> item.getValue() > 100);
    }

    @Override
    public boolean deveUsarMaximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQueCemReais(orcamento);
    }

    @Override
    public double minimaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
