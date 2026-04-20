package exerciciosextras.polimorfismo_colecoes.exercicio1;

public abstract class Produto {
    protected String nome;
    protected double peso;

    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract double calcularFrete();
}