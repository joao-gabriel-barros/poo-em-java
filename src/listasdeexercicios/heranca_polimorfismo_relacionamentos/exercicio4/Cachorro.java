package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio4;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido.");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}