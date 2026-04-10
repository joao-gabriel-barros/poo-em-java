package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio3;

public class IngressoEstudante extends Ingresso {
    @Override
    public double calcularValorFinal() {
        return valorBase * 0.5;
    }
}