package br.com.teste.chainofresponsibility2;

public class RespostaEmXml implements Resposta {

    private final Resposta outraResposta;

    public RespostaEmXml(final Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    @Override
    public void responde(final Requisicao req, final Conta conta) {
        if (req.getFormato() == Formato.XML) {
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        } else {
            outraResposta.responde(req, conta);
        }
    }

}
