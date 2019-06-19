package br.com.teste.chainofresponsibility2;

public class RespostaEmPorcento implements Resposta {

    private final Resposta outraResposta;

    public RespostaEmPorcento(final Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    public RespostaEmPorcento() {
        this.outraResposta = null;
    }

    @Override
    public void responde(final Requisicao req, final Conta conta) {
        if (req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        } else if (outraResposta != null) {
            outraResposta.responde(req, conta);
        } else {
            throw new RuntimeException("Formato não encontrado");
        }
    }

}
