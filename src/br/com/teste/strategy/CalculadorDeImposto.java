package br.com.teste.strategy;

public class CalculadorDeImposto {

    public void realizaCalculo(final Orcamento orcamento, final Imposto imposto) {
        double icms = imposto.calcula(orcamento);
        System.out.println(icms);
    }

}
