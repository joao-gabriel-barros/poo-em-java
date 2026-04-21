package exerciciosextras.exceptions.exercicio3;

public class TesteProcessadorPagamento {
    public static void main(String[] args) {
        ProcessadorPagamento pagamento = new ProcessadorPagamento();

        try {
            pagamento.processar(1299.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Conexão com a operadora de cartão encerrada.");
        }
    }
}