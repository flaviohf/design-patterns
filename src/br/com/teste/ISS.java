package br.com.teste;

public class ISS implements Imposto {

    public double calcula(final Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
