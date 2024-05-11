public class Operadores {
    public static void main (String[] args) {
        /* Declaração de variáveis de operadores aritméticos e seus exemplos: */

        double valorSoma1 = 10.5;
        double valorSoma2 = 15.7;
        int valorSubtracao1 = 113;
        int valorSubtracao2 = 25;
        int valorMultiplicacao1 = 20;
        int valorMultiplicacao2 = 7;
        int valorDivisao1 = 15;
        int valorDivisao2 = 3;
        int valorModulo1 = 18;
        int valorModulo2 = 3;
        String calculo1 = "(10 * 7)";
        String calculo2 = "(20 / 4)";
        int valorCalculo1 = 10 * 7;
        int valorCalculo2 = 20 / 4;

        System.out.println("Exemplos de cálculos utilizando cada um dos operadores aritméticos: ");
        double soma = valorSoma1 + valorSoma2;
        System.out.println("Os valores para a soma são: " + valorSoma1 + " e " + valorSoma2);
        System.out.println("A soma dos valores é: " + soma + "\n");

        int subtracao = valorSubtracao1 - valorSubtracao2;
        System.out.println("Os valores para a subtração são: " + valorSubtracao1 + " e " + valorSubtracao2);
        System.out.println("A subtração dos valores é: " + subtracao + "\n");

        int multiplicacao = valorMultiplicacao1 * valorMultiplicacao2;
        System.out.println("Os valores para a multiplicação são: " + valorMultiplicacao1 + " e " + valorMultiplicacao2);
        System.out.println("A multiplicação dos valores é: " + multiplicacao + "\n");

        int divisao = valorDivisao1 / valorDivisao2;
        System.out.println("Os valores para a divisão são: " + valorDivisao1 + " e " + valorDivisao2);
        System.out.println("A divisão dos valores é: " + divisao + "\n");

        int modulo = valorModulo1 % valorModulo2;
        System.out.println("Os valores para verificar o resto da divisão são: " + valorModulo1 + " e " + valorModulo2);
        System.out.println("O resto da divisão dos valores é: " + modulo + "\n");

        double resultado = (valorCalculo1) + (valorCalculo2);
        System.out.println("As expressões a serem resolvidas são: " + calculo1 + " + " + calculo2);
        System.out.println("O resultado do cálculo é: " + resultado + "\n");

        System.out.println("Exemplos de concatenação de textos utilizando o operador '+': ");

        /* Exemplos de concatenação: */

        System.out.println("Concatenação do 'nome' + 'segundo nome' + 'sobrenome': ");
        String nomeCompleto = "Guilherme " + "Augusto " + "Paim" + ".";
        System.out.println("Meu nome completo é: " + nomeCompleto);

        System.out.println("\nAbaixo exemplos de como funciona a concatenação de dados numéricos e Strings:");

        String concatenacao = "";

        System.out.println("Concatenação: 1+1+1+'1':");
        concatenacao = 1+1+1+"1"; /* Somou os três primeiros números e depois concatenou com a string. */
        System.out.println(concatenacao + "\n");

        System.out.println("Concatenação: 1+'1'+1+1:");
        concatenacao = 1+"1"+1+1; /* Após concatenar com a String, o restante dos números é concatenado invés de somado. */
        System.out.println(concatenacao + "\n");

        System.out.println("Concatenação: 1+'1'+1+'1':");
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao + "\n");

        System.out.println("Concatenação: '1'+1+1+1:");
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao + "\n");

        System.out.println("Concatenação: '1'+(1+1+1):");
        concatenacao = "1"+(1+1+1); /* Primeiro calculou o que está dentro do parêntese (que está em evidência) e depois concatenou. */
        System.out.println(concatenacao);

        System.out.println("\nExemplos de operadores unários:");

        int num = 5; /* Número(valor) positivo. */
        System.out.println(- num); /* Número(valor) se torna negativo utilizando o operador unário '-' apenas na impressão, não alterando a variável. */

        num = - num; /* Torna a variável negativa. */
        System.out.println(num);

        /* E para torná-lo positivo novamente?*/

        num = num * -1; /* Multiplica-se a variável por '-1' para torná-la um valor positivo. */
        System.out.println(num);

        /* Para incrementar +1 na variável, utiliza-se o operador '++', como no exemplo abaixo: */

        num ++; /* Incrementa em +1 */
        System.out.print(num + "\n");

        num --; /* Decrementa em -1 */
        System.out.print(num + "\n");

        boolean verdade = true;
        System.out.print(verdade + "\n");
        System.out.print(!verdade + "\n"); /* Retorna a negação do valor */

        System.out.println("\nExemplos do operador ternário: \n");

        /* Operador ternário é uma forma resumida de realizar a condição "IF". Este operador é representado por '?' e ':'.
           (Expressão condicional) ? "verdadeiro/se for isso" : "falso/senão é isso"; */

        /* Exemplo de estrutura utilizando "if" normalmente */

        int num1, num2;
        String result;

        num1 = 5;
        num2 = 6;

        if(num1==num2)
            result = "Verdadeiro!" ;
        else
            result = "Falso!";
        System.out.println(result);

        /* Exemplo de estrutura utilizando o operador ternário para declarar uma String. */

        String result2 = (num1 == num2) ? "Verdadeiro!" : "Falso!";
        System.out.println(result2);

        /* Exemplo de estrutura utilizando o operador ternário para declarar um Int. */

        int result3 = (num1 == num2) ? 1 : 0;
        System.out.println(result3 + "\n");

        /* Operadores relacionais: ==, !=, >, >=, <, <= */

        int primeiroNum = 1, segundoNum = 2;
        boolean simNao = primeiroNum == segundoNum;

        System.out.println("O primeiro número é igual o segundo número? " + simNao);

        simNao = primeiroNum != segundoNum;

        System.out.println("O primeiro número é diferente do segundo número? " + simNao);

        simNao = primeiroNum > segundoNum;

        System.out.println("O primeiro número é maior que o segundo número? " + simNao + "\n");

        String primeiroMenor = (primeiroNum < segundoNum) ? "O primeiro número é menor que o segundo número." : "O primeiro número é maior que o segundo número,";
        System.out.println(primeiroMenor + "\n");

        /* Exemplos de comparações utilizando Strings: */
        String nome1 = "Guilherme", nome2 = "Guilherme";
        System.out.println("Exemplo de comparação de Strings:");
        System.out.println("O primeiro nome é igual ao segundo nome? " + (nome1 == nome2));

        String nome3 = new String ("Guilherme");
        System.out.println("O primeiro nome é igual ao terceiro nome? " + (nome1 == nome3));
        /* Retorna FALSO, pois são objetos diferentes, mesmo que tenham o mesmo valor. */


        /* Para comparar valores iguais em objetos diferentes, utiliza-se o método "equals". */
        System.out.println("O primeiro nome é igual ao terceiro nome? " + (nome1.equals(nome3)) + "\n");

        /* Operadores lógicos: && e || */
        System.out.println("Exemplo de comparação utilizando operadores lógicos: " + "\n");
        boolean condicao1 = true, condicao2 = true;

        /* O código só é executado se as duas condições forem verdadeiras. */
        if(condicao1 && condicao2) {
            System.out.println("As duas variáveis são verdadeiras!"); // Mas utilizando &&, a segunda condição só será validada se a primeira for verdadeira.
        }

        /* Exemplo de validação utilizando operadores abreviados. */
        int x1 = 1, x2 = 2;

        // A validação da segunda condição será executada mesmo se a primeira for falsa.
        if ((x1 > x2) & checagem2()) {
            System.out.println("Rodou if."); // Não rodou, pois a primeira condição é falsa.
        }
        if ((x1 < x2) & x2++ == 2) { // Executa a validação e adiciona +1 no x2. Só adicionaria +1 ao x2 antes da validação se o ++ estivesse na esquerda.
            System.out.println("Rodou segundo if.");
        }
        System.out.println("x2 agora vale: " + x2);

        // Bitwise são operadores que trabalham com os bits de um número, nesse caso está comparando se os bits do número 2 & 2 são iguais aos bits do número 2.
        if ((2 & 2) == 2) {
            System.out.println("Rodou o bitwise.");
        }
    }
        public static boolean checagem2(){ // Criado método para fazer a validação do primeiro if.
        System.out.println("Rodou a checagem2.");
        return true;
    }
}











