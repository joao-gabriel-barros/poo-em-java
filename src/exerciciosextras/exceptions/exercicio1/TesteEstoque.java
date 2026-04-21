package exerciciosextras.exceptions.exercicio1;

public class TesteEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        try {
            estoque.retirarEstoque(120);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro na operação: " + e.getMessage());
        }
    }
}