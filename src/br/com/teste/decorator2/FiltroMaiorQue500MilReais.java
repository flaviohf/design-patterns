package br.com.teste.decorator2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMaiorQue500MilReais extends Filtro {

    public FiltroMaiorQue500MilReais(final Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMaiorQue500MilReais() {
        super();
    }

    @Override
    public List<Conta> filtra(final List<Conta> contas) {

        final List<Conta> filtrada = contas.stream()
                .filter(conta -> conta.getSaldo() > 500000)
                .collect(Collectors.toList());

        filtrada.addAll(this.proximo(contas));
        return filtrada;
    }

}
