package exerciciosextras.exceptions.exercicio3;

public class ProcessadorPagamento {
    private double saldoDisponivel = 500.0;

    void processar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor deve ser positivo. ");
        } else if (valor > saldoDisponivel) {
            throw new SaldoInsuficienteException("O saldo atual é insuficiente. ");
        } else {
            saldoDisponivel -= valor;
            System.out.println("Pagamento aprovado!");
        }
    }
}