package exerciciosextras.interfaces.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestePersonagem {
    public static void main(String[] args) {
        List<Personagem> arena = new ArrayList<>();
        Guerreiro g1 = new Guerreiro("General Shaw");
        arena.add(g1);
        Mago m1 = new Mago("Kung Lao");
        arena.add(m1);
        for (Personagem p : arena) {
            p.atacar();
            if (p instanceof Curavel) {
                ((Curavel) p).aplicarCura(); // CASTING
            }
        }
    }
}