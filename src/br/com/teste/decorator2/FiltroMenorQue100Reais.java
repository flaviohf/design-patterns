package br.com.teste.decorator2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenorQue100Reais extends Filtro {

    public FiltroMenorQue100Reais(final Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMenorQue100Reais() {
        super();
    }

    @Override
    public List<Conta> filtra(final List<Conta> contas) {
        final List<Conta> filtrada = contas.stream()
                .filter(conta -> conta.getSaldo() < 100)
                .collect(Collectors.toList());

        filtrada.addAll(this.proximo(contas));
        return filtrada;
    }

}
