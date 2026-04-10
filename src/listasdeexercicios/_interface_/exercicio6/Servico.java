package listasdeexercicios._interface_.exercicio6;

public class Servico implements Tributavel {
    private String descricao;
    private double valor;
    private int horasTrabalhadas;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularTributos() {
        double calculoS = 0.0;
        calculoS = (valor * 0.12) + (horasTrabalhadas * 10.0);
        return calculoS;
    }
}