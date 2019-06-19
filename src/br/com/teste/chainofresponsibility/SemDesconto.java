package br.com.teste.chainofresponsibility;

public class SemDesconto implements Desconto {

    @Override
    public double desconto(final Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(final Desconto proximo) {
        //nada
    }
}
