package listasdeexercicios.enum_record_sealedclasses.exercicio2;

public class Teste {
    public static void main(String[] args) {
        try {
            Produto p1 = new Produto("Notebook Gamer", 5000.00, "Eletrônicos");
            System.out.println("Produto Original: " + p1);

            Produto p2 = p1.aplicarDesconto(10);
            System.out.println("Produto com Desconto: " + p2);

            System.out.println("Preço do p1 após desconto no p2: " + p1.preco());

            Produto p3 = new Produto("Teclado", -50.0, "Periféricos");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }
}