package br.com.teste.decorator2;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroMesmoMes extends Filtro {

    public FiltroMesmoMes(final Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMesmoMes() {
        super();
    }

    @Override
    public List<Conta> filtra(final List<Conta> contas) {
        final List<Conta> filtrada = contas.stream()
                .filter(FiltroMesmoMes::isMesmoMes)
                .collect(Collectors.toList());

        filtrada.addAll(this.proximo(contas));
        return filtrada;
    }

    private static boolean isMesmoMes(final Conta conta) {
        return conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
                conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR);
    }

}
