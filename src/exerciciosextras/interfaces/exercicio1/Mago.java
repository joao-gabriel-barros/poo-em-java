package exerciciosextras.interfaces.exercicio1;

public final class Mago extends Personagem implements Curavel {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println("O Mago lança uma bola de fogo!");
    }

    @Override
    public void aplicarCura() {
        System.out.println("O Mago usa magia e recupera 20 pontos de vida!");
    }
}