import java.util.Scanner;
public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Guilherme", "Amanda", "Michele", "Theodoro"};

        double media = calculaMediaTurma(alunos, scanner);

        System.out.printf("Média da turma %.1f", media);
    }
    static double calculaMediaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }



}
