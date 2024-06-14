package comunicacao.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMsg();
    public abstract void receberMsg();

    // Somente as classes que se estendem de "ServicoMensagemInstantanea" poderão visualizar esses métodos.
    protected abstract void salvarHistoricoMsg();
    protected abstract void validarConexaoInternet();
}