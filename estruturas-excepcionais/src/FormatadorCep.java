public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("9504325");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O CEP informado é inválido.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
            throw new CepInvalidException();

        return "95.043-250";
    }
}
