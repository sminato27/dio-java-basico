public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        // Condicional Composta
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else
            System.out.println("Reprovado!");

        // Condicional Encadeada
        if (nota >= 7) // Sempre verdadeira
            System.out.println("Aprovado!");
        else if (nota >= 5 && nota < 7) // Verdadeira ou Falsa
            System.out.println("Em recuperação!");
        else // Sempre falsa
            System.out.println("Reprovado!");

        // Condicional Ternário Composta
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);

        // Condicional Ternário Encadeado
        String resultado2 = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Em recuperação!" : "Reprovado!";
        System.out.println(resultado2);
    }
}
