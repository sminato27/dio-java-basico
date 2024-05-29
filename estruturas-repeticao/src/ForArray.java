public class ForArray {
    public ForArray() {
    }

    public static void main(String[] args) {
        String[] alunos = new String[]{"Felipe", "Gabriel", "Ana", "Simporimpola"};
        System.out.println("Estrutura 01: ");

        for(int x = 0; x < alunos.length; ++x) {
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }

        System.out.println("\nEstrutura 02 (For/Each): ");
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}