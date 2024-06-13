package loja;

public class SistemaCadastro {
    public static void main(String[] args) {
        // Criação do cliente no sistema:
        Cliente marcos = new Cliente("Marcos", "123");

        // Definição do endereço do marcos
        marcos.setEndereco("Rua das Marias");

        System.out.println("O cliente é " + marcos.getNome() + ", CPF: " + marcos.getCpf() + " e mora no endereço: " + marcos.getEndereco() + ".");

    }
}
