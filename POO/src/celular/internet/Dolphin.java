package celular.internet;

public class Dolphin implements NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }
}
