package ControleFluxo;

public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("0923050");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep deve conter 8 dígitos");
        }
    }

    static String formatarCep( String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "09.230.590";
    }
}
