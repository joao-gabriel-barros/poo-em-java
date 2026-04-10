package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio2;

public class Caminhao extends VeiculoBase {
    private int qtdEixos;

    public Caminhao(String placa, double pesoTon, int qtdEixos) {
        super(placa, pesoTon);
        this.qtdEixos = qtdEixos;
    }

    @Override
    public double calcularPedagio() {
        return (pesoTon * 5.0) + (qtdEixos * 2.0);
    }
}