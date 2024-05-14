public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: "  +smartTv.volume);

        smartTv.ligar();
        System.out.println("(Novo Status) A TV está ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("(Novo Status) A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume agora é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume agora é: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("O canal agora é: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("O canal subiu para: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("O canal desceu para: " + smartTv.canal);
    }
}
