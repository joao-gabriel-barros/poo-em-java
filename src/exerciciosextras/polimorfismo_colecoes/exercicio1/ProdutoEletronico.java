package exerciciosextras.polimorfismo_colecoes.exercicio1;

public class ProdutoEletronico extends Produto {
    private double valorDeclarado;

    public ProdutoEletronico(String nome, double peso, double valorDeclarado) {
        super(nome, peso);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public double calcularFrete() {
        return (peso * 1.5) + (valorDeclarado * 0.01);
    }
}