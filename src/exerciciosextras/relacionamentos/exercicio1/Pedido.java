package exerciciosextras.relacionamentos.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    void exibirResumo() {
        System.out.println("Número do pedido: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        double somaTotal = 0.0;
        for (Produto p : produtos) {
            System.out.println("Nome do produto: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            somaTotal += p.getPreco();
        }
        System.out.println("Valor Total do Pedido: " + somaTotal);
    }
}