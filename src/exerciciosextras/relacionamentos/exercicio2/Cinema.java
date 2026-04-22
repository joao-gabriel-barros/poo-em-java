package exerciciosextras.relacionamentos.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String nome;
    private List<Sessao> sessaoList = new ArrayList<>();

    public Cinema(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void adicionarSessao(Sessao s) {
        sessaoList.add(s);
    }

    void listarProgramacao() {
        for (Sessao s : sessaoList) {
            s.exibirDetalhes();
        }
    }
}