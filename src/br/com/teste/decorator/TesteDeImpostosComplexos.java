package br.com.teste.decorator;

import br.com.teste.strategy.Orcamento;

public class TesteDeImpostosComplexos {

    public static void main(final String[] args) {
        final Imposto iss = new ISS(new ICMS(new ICPP()));

        final Orcamento orcamento = new Orcamento(500);
        final double valor = iss.calcula(orcamento);

        System.out.println(valor);
    }

}
