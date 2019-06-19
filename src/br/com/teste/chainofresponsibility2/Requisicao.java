package br.com.teste.chainofresponsibility2;

public class Requisicao {

    private final Formato formato;

    public Requisicao(final Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}
