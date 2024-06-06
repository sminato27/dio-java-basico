import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
public class ProcessoSeletivo {
    static List<String> candidatosSelecionados = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("** Processo seletivo **");
        selecionarCandidatos();
        imprimirSelecionados();
        for (String candidato: candidatosSelecionados){
            ligar(candidato);
        }
    }

    static void ligar(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativas++;
            } else System.out.println("Contato realizado com sucesso!");

        } while(continuarTentando && tentativas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + "ª tentativa.");
        } else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de " + tentativas + " tentativas realizado.");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        // String [] candidatos = {"Emanuel", "Felipe", "Gabriel", "Matheus", "João"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        /* Caso queira mostrar o índice:
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é o: " + candidatos[indice]);
        }*/

        // System.out.println("Forma abreviada de interação 'for each'");
        for (String candidato: candidatosSelecionados){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecionarCandidatos() {
        String [] candidatos = {"Emanuel", "Felipe", "Gabriel", "Matheus", "João", "Eliza", "Pietra", "Ingrid", "Larissa", "Brenda"};

        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                ProcessoSeletivo.candidatosSelecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
                System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }
    }
}
