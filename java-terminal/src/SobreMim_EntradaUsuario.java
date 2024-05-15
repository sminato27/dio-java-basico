import java.util.Locale;
import java.util.Scanner;

public class SobreMim_EntradaUsuario {
    public static void main(String[] args) {
        // Criação do Scanner.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        // Demonstração dos dados inseridos pelo usuário.

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome + "!");
        System.out.println("Tenho " + idade + " anos e...");
        System.out.println("Tenho " + altura + "cm de altura!");
    }
}