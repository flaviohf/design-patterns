package br.com.teste.chainofresponsibility;

public class Item {

    private final String name;
    private final double value;

    public Item(final String name, final double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
