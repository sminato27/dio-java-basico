package comunicacao.apps;

public class Messenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMsg() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo FB Messenger");
        salvarHistoricoMsg();
    }

    @Override
    public void receberMsg() {
        System.out.println("Enviando mensagem pelo FB Messenger");
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
