package listasdeexercicios.enum_record_sealedclasses.exercicio1;

public class Teste {
    public static void main(String[] args) {
        StatusPedido statusAtual = StatusPedido.AGUARDANDO_PAGAMENTO;

        System.out.println("---Início do Fluxo do Pedido---");
        System.out.println(statusAtual);
        statusAtual = StatusPedido.PROCESSANDO;
        System.out.println(StatusPedido.PROCESSANDO.getDescricao());
        statusAtual = StatusPedido.ENVIADO;
        System.out.println(StatusPedido.ENVIADO.getDescricao());
        statusAtual = StatusPedido.ENTREGUE;
        System.out.println(StatusPedido.ENTREGUE.getDescricao());
    }
}