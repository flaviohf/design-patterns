package br.com.teste.strategy;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();
        Orcamento orcamento = new Orcamento(500.00);
        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.realizaCalculo(orcamento, iss);
        calculadorDeImposto.realizaCalculo(orcamento, icms);
        calculadorDeImposto.realizaCalculo(orcamento, iccc);
    }

}
