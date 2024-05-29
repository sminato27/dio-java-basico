public class ExemploBreakContinue {
    public ExemploBreakContinue() {
    }
    public static void main(String[] args) {
        System.out.println("Exemplo 'Break': ");

        int num;
        for(num = 1; num <= 5; num++) {
            if (num==3)
                break;

            System.out.println(num);
        }

        System.out.println("\nExemplo 'Continue': ");

        int num2;
        for(num2 = 1; num2 <= 10; num2++) {
            if (num2 == 5)
                continue;

            System.out.println(num2);
        }
    }
}