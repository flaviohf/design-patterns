package br.com.teste;

public class ICMS implements Imposto {

    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
