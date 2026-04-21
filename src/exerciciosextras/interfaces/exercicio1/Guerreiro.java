package exerciciosextras.interfaces.exercicio1;

public final class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println("Guerreiro atacando com sua espada!");
    }
}