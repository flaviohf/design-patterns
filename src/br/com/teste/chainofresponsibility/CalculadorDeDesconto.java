package br.com.teste.chainofresponsibility;

public class CalculadorDeDesconto {

    public double calcula(final Orcamento orcamento) {
        final Desconto d1 = new DescontoPorCincoItens();
        final Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        final Desconto d3 = new DescontoPorVendaCasada();
        final Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconto(orcamento);
    }

}
