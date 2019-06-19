package br.com.teste.templatemethod;

import br.com.teste.chainofresponsibility2.Conta;

import java.util.List;

public abstract class Relatorio {

    protected abstract void cabecalho();

    protected abstract void rodape();

    private void corpo(final List<Conta> contas) {
        for (final Conta conta : contas) {
            System.out.println(conta.getTitular() + " - " + conta.getSaldo());
        }
    }

    public void imprime(final List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
    }

}
