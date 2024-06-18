package celular.telefone;

public class Discador implements AparelhoTelefonico{
    public void ligar(String numero){
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender(){
        System.out.println("Atendendo ligação.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Abrindo correio de voz.");
    }
}
