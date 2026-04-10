package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio4;

public class Teste {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Beto";
        c1.idade = 5;
        System.out.println(c1);
        c1.emitirSom();

        Gato g1 = new Gato();
        g1.nome = "Fred";
        g1.idade = 3;
        System.out.println(g1);
        g1.emitirSom();
    }
}