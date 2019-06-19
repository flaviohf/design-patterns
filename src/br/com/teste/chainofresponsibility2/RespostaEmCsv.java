package br.com.teste.chainofresponsibility2;

public class RespostaEmCsv implements Resposta {

    private final Resposta outraResposta;

    public RespostaEmCsv(final Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    @Override
    public void responde(final Requisicao req, final Conta conta) {
        if (req.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        } else {
            outraResposta.responde(req, conta);
        }
    }

}
