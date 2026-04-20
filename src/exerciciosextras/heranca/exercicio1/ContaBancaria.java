package exerciciosextras.heranca.exercicio1;

public abstract sealed class ContaBancaria permits ContaCorrente {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
        } else if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Não é possível sacar esse valor! Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}