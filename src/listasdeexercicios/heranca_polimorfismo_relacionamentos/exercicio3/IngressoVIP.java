package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio3;

public class IngressoVIP extends Ingresso {
    private double adicional;

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double calcularValorFinal() {
        return valorBase + adicional;
    }
}