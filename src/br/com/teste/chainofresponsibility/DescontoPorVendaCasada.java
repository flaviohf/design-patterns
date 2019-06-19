package br.com.teste.chainofresponsibility;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconto(final Orcamento orcamento) {
        return aconteceuVendaCasada(orcamento) ? 0.05 : proximo.desconto(orcamento);
    }

    private boolean aconteceuVendaCasada(final Orcamento orcamento) {
        return orcamento.contemItemPorNome("Caneta") && orcamento.contemItemPorNome("Lapis");
    }

    @Override
    public void setProximo(final Desconto proximo) {
        this.proximo = proximo;
    }
}
