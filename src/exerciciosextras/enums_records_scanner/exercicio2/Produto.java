package exerciciosextras.enums_records_scanner.exercicio2;

public record Produto(String nome, double precoBase, Categoria categoria) {
    double calcularPrecoFinal() {
        return precoBase + (precoBase * categoria.getImposto());
    }
}