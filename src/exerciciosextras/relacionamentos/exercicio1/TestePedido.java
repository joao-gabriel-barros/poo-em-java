package exerciciosextras.relacionamentos.exercicio1;

public class TestePedido {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João Silva", "123.456.789-00");

        Pedido meuPedido = new Pedido(1001, c1);

        Produto p1 = new Produto("Mac Mini M4", 5999.00);
        Produto p2 = new Produto("Mouse Gamer", 250.00);

        meuPedido.adicionarProduto(p1);
        meuPedido.adicionarProduto(p2);

        meuPedido.exibirResumo();
    }
}