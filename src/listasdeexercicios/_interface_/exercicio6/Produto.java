package listasdeexercicios._interface_.exercicio6;

public class Produto implements Tributavel {
    private String nome;
    private double valor;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularTributos() {
        double calculoP = 0.0;
        calculoP = (valor * 0.1) + (peso * 5.0);
        return calculoP;
    }
}