package br.com.teste.chainofresponsibility;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double desconto(final Orcamento orcamento) {
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {
            return proximo.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(final Desconto proximo) {
        this.proximo = proximo;
    }

}
