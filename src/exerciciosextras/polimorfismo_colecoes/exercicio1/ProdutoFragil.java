package exerciciosextras.polimorfismo_colecoes.exercicio1;

public class ProdutoFragil extends Produto {
    private double custoEmbalagemEspecial;

    public ProdutoFragil(String nome, double peso, double custoEmbalagemEspecial) {
        super(nome, peso);
        this.custoEmbalagemEspecial = custoEmbalagemEspecial;
    }

    public double getCustoEmbalagemEspecial() {
        return custoEmbalagemEspecial;
    }

    public void setCustoEmbalagemEspecial(double custoEmbalagemEspecial) {
        this.custoEmbalagemEspecial = custoEmbalagemEspecial;
    }

    @Override
    public double calcularFrete() {
        return (peso * 2.0) + custoEmbalagemEspecial;
    }
}