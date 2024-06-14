package comunicacao.apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMsg() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistoricoMsg();
    }

    @Override
    public void receberMsg() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    protected void salvarHistoricoMsg() {
        System.out.println("Salvando histórico de mensagens.");
    }

    @Override
    protected void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet.");
    }


}
