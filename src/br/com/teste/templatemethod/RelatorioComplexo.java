package br.com.teste.templatemethod;

import java.util.Calendar;

public class RelatorioComplexo extends Relatorio {

    @Override
    protected void cabecalho() {
        System.out.println("Banco XYZ");
        System.out.println("Avenida Paulista, 1234");
        System.out.println("(11) 1234-5678");
    }

    @Override
    protected void rodape() {
        System.out.println("banco@xyz.com.br");
        System.out.println(Calendar.getInstance().getTime());
    }

}
