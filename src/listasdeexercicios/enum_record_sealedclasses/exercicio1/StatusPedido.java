package listasdeexercicios.enum_record_sealedclasses.exercicio1;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO(1, "O pedido aguarda a confirmação do banco."),
    PROCESSANDO(2, "O pagamento foi aprovado e o pedido está sendo separado."),
    ENVIADO(3, "O pedido já saiu do nosso centro de distribuição."),
    ENTREGUE(4, "O pedido foi entregue ao destinatário.");

    private final int codigo;
    private final String descricao;

    StatusPedido(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}