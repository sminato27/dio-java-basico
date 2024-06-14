package comunicacao;

import comunicacao.apps.MSNMessenger;
import comunicacao.apps.Messenger;
import comunicacao.apps.ServicoMensagemInstantanea;
import comunicacao.apps.Telegram;

public class ComputadorJoaozinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "MSN";

        if (appEscolhido.equals("MSN")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("Messenger")) {
            smi = new Messenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        smi.enviarMsg();
        smi.receberMsg();
    }
}
