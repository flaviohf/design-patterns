package br.com.teste.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    protected Filtro outroFiltro;

    public Filtro(final Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public Filtro() {
    }

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> proximo(final List<Conta> contas) {
        if (this.outroFiltro != null) {
            return this.outroFiltro.filtra(contas);
        } else {
            return new ArrayList<>();
        }
    }

}
