package br.com.teste.chainofresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private final List<Item> itens;

    public Orcamento(final double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void addItem(final Item item) {
        this.itens.add(item);
    }

    public boolean contemItemPorNome(final String nome) {
        return this.itens.stream().anyMatch(item -> item.getName().equalsIgnoreCase(nome));
    }
}
