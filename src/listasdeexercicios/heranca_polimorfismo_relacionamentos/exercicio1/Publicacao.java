package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio1;

public class Publicacao {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}