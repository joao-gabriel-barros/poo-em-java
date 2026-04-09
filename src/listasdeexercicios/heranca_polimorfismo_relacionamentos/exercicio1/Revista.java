package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio1;

public class Revista extends Publicacao {
    private String mesEdicao;

    public Revista(String titulo, String autor, int anoPublicacao, String mesEdicao) {
        super(titulo, autor, anoPublicacao);
        this.mesEdicao = mesEdicao;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "mesEdicao='" + mesEdicao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}