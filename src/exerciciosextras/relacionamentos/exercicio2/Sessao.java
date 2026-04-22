package exerciciosextras.relacionamentos.exercicio2;

public class Sessao {
    private int numeroSala;
    private String horario;
    private Filme filme;

    public Sessao(int numeroSala, String horario, Filme filme) {
        this.numeroSala = numeroSala;
        this.horario = horario;
        this.filme = filme;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    void exibirDetalhes() {
        System.out.println("Número da sala: " + this.numeroSala);
        System.out.println("Horário da sessão: " + this.horario);
        System.out.println("Título: " + this.filme.getTitulo());
        System.out.println("Duração em minutos: " + this.filme.getDuracaoEmMinutos());
    }
}