package comunicacao.apps;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMsg() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMsg();
    }

    @Override
    public void receberMsg() {
        System.out.println("Enviando mensagem pelo Telegram");
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
