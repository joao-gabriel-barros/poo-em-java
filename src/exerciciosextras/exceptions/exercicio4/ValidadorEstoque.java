package exerciciosextras.exceptions.exercicio4;

public class ValidadorEstoque {
    void validarSku(String sku) throws FormatoSkuInvalidoException {
        if (sku == null || sku.length() != 6) {
            throw new FormatoSkuInvalidoException("O Sku não pode ser nulo ou diferente de 6 caracteres.");
        } else {
            System.out.println("Sku válido: " + sku);
        }
    }
}