package exerciciosextras.exceptions.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class TesteValidadorEstoque {
    public static void main(String[] args) {
        List<String> skus = new ArrayList<>();
        skus.add("123456");
        skus.add("54321");
        skus.add("ABC123");
        skus.add("ABCD5");
        skus.add("JG123456");
        // Em uma única linha: List<String> skus = Arrays.asList("PROD01", "ABC", "123456", "SKU99");

        ValidadorEstoque validadorEstoque = new ValidadorEstoque();
        for (String s : skus) {
            try {
                validadorEstoque.validarSku(s);
            } catch (FormatoSkuInvalidoException e) {
                System.err.println("Erro ao processar o código " + s + ": " + e.getMessage());
            } finally {
                System.out.println("Verificação do item finalizada.");
            }
        }
    }
}