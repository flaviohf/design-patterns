package br.com.teste.chainofresponsibility;

public class TesteDeDescontos {

    public static void main(final String[] args) {
        final Desconto d1 = new DescontoPorCincoItens();
        final Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        final Desconto d3 = new DescontoPorVendaCasada();
        final Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        final Item lapis = new Item("LAPIS", 15.00);
        final Item caneta = new Item("CANETA", 15.00);
        final Item borracha = new Item("borracha", 15.00);

        final Orcamento orcamento = new Orcamento(500.0);
        orcamento.addItem(caneta);
        orcamento.addItem(borracha);
        orcamento.addItem(lapis);

        final double desconto = d1.desconto(orcamento);
        System.out.println(desconto);
    }

}
