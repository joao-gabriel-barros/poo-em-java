package exerciciosextras.exceptions.exercicio1;

public class Estoque {
    private int qtdAtual = 100;

    public void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser positiva!");
        }
        if (quantidade > qtdAtual) {
            throw new IllegalArgumentException("Estoque insuficiente! Temos apenas: " + qtdAtual);
        }
        this.qtdAtual -= quantidade;
        System.out.println("Retirada feita! Estoque atual: " + qtdAtual);
    }
}