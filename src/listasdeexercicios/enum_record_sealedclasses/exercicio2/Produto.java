package listasdeexercicios.enum_record_sealedclasses.exercicio2;

public record Produto(String nome, double preco, String categoria) {
    public Produto {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo: " + preco);
        }
    }

    public Produto aplicarDesconto(double percentual) {
        double novoPreco = this.preco * (1 - (percentual / 100));
        return new Produto(this.nome, novoPreco, this.categoria);
    }
}