package br.com.teste.templatemethod;

public class RelatorioSimples extends Relatorio {

    @Override
    protected void cabecalho() {
        System.out.println("Banco XYZ");
    }

    @Override
    protected void rodape() {
        System.out.println("(11) 1234-5678");
    }

}
