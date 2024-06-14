package autodromo;

public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("autodromo.Carro ligado.");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível.");
    }

    private void confereCambio() {
        System.out.println("Confere câmbio em P.");
    }

}
