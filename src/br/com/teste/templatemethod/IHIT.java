package br.com.teste.templatemethod;

import br.com.teste.strategy.Orcamento;

import java.util.Collections;

public class IHIT extends TemplateDeImpostoCondicional {

    private boolean temDoisItensComMesmoNome(final Orcamento orcamento) {
        return orcamento.getItens().stream().anyMatch(item -> Collections.frequency(orcamento.getItens(), item) > 1);
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(final Orcamento orcamento) {
        return temDoisItensComMesmoNome(orcamento);
    }

    @Override
    protected double minimaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
    }

    @Override
    protected double maximaTaxacao(final Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }
}
