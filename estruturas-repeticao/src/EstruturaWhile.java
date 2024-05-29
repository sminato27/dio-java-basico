import java.util.concurrent.ThreadLocalRandom;
public class EstruturaWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        System.out.println("A mesada atual de Joãozinho é: R$" + String.format("%.2f", mesada));

        while (mesada > 0.0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            String valorFormatado = String.format("%.2f", valorDoce);
            System.out.println("Doce do valor: R$" + valorFormatado + " adicionado ao carrinho!");
            mesada -= valorDoce;
            System.out.println("Mesada restante: R$" + String.format("%.2f", mesada));
        }

        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1.0, 15.0);
    }
}
