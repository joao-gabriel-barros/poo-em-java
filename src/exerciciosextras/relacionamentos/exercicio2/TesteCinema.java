package exerciciosextras.relacionamentos.exercicio2;

public class TesteCinema {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Gente Grande", 140);
        Filme filme2 = new Filme("Homem Aranha 2", 150);

        Sessao sessao1 = new Sessao(1, "13:00h", filme1);
        Sessao sessao2 = new Sessao(2, "17:00h", filme1);
        Sessao sessao3 = new Sessao(3, "21:00h", filme2);

        Cinema serratecCine = new Cinema("SerratecCineMax");
        serratecCine.adicionarSessao(sessao1);
        serratecCine.adicionarSessao(sessao2);
        serratecCine.adicionarSessao(sessao3);
        serratecCine.listarProgramacao();
    }
}