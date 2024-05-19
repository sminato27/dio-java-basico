public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // B, M ou T

        /* Condicional Encadeada onde certas informações são repetidas, pode ser melhor utilizado usando Switch-Case
        if (plano == "B"){
            System.out.println("100 Minutos de ligação");
        }else if (plano == "M"){
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        }else if (plano == "T"){
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb de Youtube");
        }
        */

        // Switch-Case utilizado de forma complementar, não condicionalmente.
        switch (plano){ // Executado de forma decrescente para pegar as informações de planos anteriores.
            case "T":{
                System.out.println("5Gb de Youtube");
            } // Break não é utilizado, justamente para seguir o fluxo propositalmente.
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 Minutos de ligação");
            }
        }

    }
}
