package autodromo;

public class Concessionaria {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.setChassi("821883");
        //bmw.ligar();

        Moto m300 = new Moto();
        m300.setChassi("444127");
        //m300.ligar();

        Veiculo coringa = m300;
        coringa.ligar();
    }
}
