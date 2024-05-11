public class TiposVariaveis {
    public static void main(String[] args) {
        /* Declaração de variáveis primitivas e seus valores: */

        byte idade = 10; /* Valores entre -128 e 127.*/
        short ano = 2024; /* Valores entre -32.768 e 32.767. */
        int cep = 95043250; /* Valores entre -2.147.483.648 e 2.147.483.647. */
        long cpf = 94605482911L; /* Valores entre -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807. */
        float pi = 3.14F; /* Valores entre -3,4028E + 38 e 3,4028E + 38. */
        double salario = 1750.99; /* Valores entre -1,7976E + 308 e 1,7976E + 308. */
        boolean souFeliz = true; /* Valor TRUE ou FALSE. */
        char unicoCaractere = 'M'; /* Valor que contém apenas um caractére. Declarado em aspas simples. */

        /* Dicas:
        1- Float é pouco usado, normalmente usa-se o Double.
        2- Byte e Short não são mais utilizados, usa-se o Int. Já o Long é raramente usado.
        3- No final, utiliza-se Int para números inteiros e Double para números fracionados.
        4- O tipo Long precisa terminar com L e o Float precisa terminar com F.
        5- A declaração de constantes é feita utilizando a palavra reservada "final" antes do tipo da variável.
        6- Constantes sempre são escritas em CAIXA ALTA.
        */

        /* Exemplos de constantes: */

        final short ANO_MEU_NASCIMENTO = 2000;
        final char INICIAL_MEU_NOME = 'G';

    }
}
