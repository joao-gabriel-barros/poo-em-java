package exerciciosextras.heranca.exercicio1;

public final class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public ContaCorrente(String titular, double limite) {
        super(titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor deve ser positivo!");
            return; // impede que o código abaixo seja executado.
        }

        double saldoDisponivel = saldo + limite;
        if (saldoDisponivel >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite insuficiente para este saque.");
        }
    }
}