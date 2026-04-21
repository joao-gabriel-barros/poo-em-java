package exerciciosextras.interfaces.exercicio1;

public abstract sealed class Personagem permits Guerreiro, Mago {
    protected String nome;
    protected int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    abstract void atacar();
}