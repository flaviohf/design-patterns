package br.com.teste.chainofresponsibility;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double desconto(final Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else {
            return proximo.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(final Desconto proximo) {
        this.proximo = proximo;
    }

}
