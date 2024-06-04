public class Main {
    public static void main(String[] args) {
        System.out.println("Início do programa no método Main.");
        a();
        System.out.println("Finalização do programa no método Main.");
    }
    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }
    static void b() {
        System.out.println("Entrou no método b.");
        for (int x = 0; x <= 4; x++) System.out.println(x);
        c();
        System.out.println("Finalizou o método b.");
    }
    static void c() {
        System.out.println("Entrou no método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}

