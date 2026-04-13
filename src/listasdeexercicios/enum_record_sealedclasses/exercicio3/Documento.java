package listasdeexercicios.enum_record_sealedclasses.exercicio3;

public sealed class Documento permits PDF, Texto {
    private String nome;

    public Documento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}