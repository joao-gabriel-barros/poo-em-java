package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio4;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miado.");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}