package exerciciosextras.polimorfismo_colecoes.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class TesteProduto {
    public static void main(String[] args) {
        List<Produto> listaEnvios = new ArrayList<>();
        ProdutoEletronico Smartphone = new ProdutoEletronico("Iphone 14", 0.600, 3999.90);
        listaEnvios.add(Smartphone);
        ProdutoFragil PF1 = new ProdutoFragil("Taças", 0.897, 8.0);
        listaEnvios.add(PF1);
        for (Produto p : listaEnvios) {
            System.out.println(p.nome);
            System.out.println(p.calcularFrete());
        }
    }
}