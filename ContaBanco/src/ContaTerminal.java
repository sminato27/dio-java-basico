import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do Scanner:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Declaração das variáveis:
        int numeroConta = 0;
        String agencia = null, nomeCliente = null;
        double saldo = 237.48;

        // Inserção de dados pelo usuário:
        System.out.println("Olá, bem-vindo a sua conta no banco! \n");
        System.out.println("Por favor, digite seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("\nDigite o número da agência:");
        agencia = scanner.next();

        System.out.println("\nDigite o número da conta:");
        numeroConta = scanner.nextInt();

        // Exibição dos dados inseridos:
        System.out.println("\nBem-vindo " + nomeCliente + "! Obrigado por utilizar nosso banco! "
                + "Sua agência é [" + agencia + "], conta [" + numeroConta + "] e seu saldo de [" + saldo
                + "] já está disponível para saque.");

        // Fecha o scanner para evitar vazamento de memória.
        scanner.close();
    }
}