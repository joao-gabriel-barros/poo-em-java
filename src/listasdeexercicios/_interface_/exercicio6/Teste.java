package listasdeexercicios._interface_.exercicio6;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Club de Nuit Iconic");
        produto1.setValor(329.90);
        produto1.setPeso(0.446);
        System.out.println("O cálculo de tributos para o produto " + produto1.getNome() + " é: " + produto1.calcularTributos());

        Servico servico1 = new Servico();
        servico1.setDescricao("Instalação de Ar-Condicionado");
        servico1.setValor(499.90);
        servico1.setHorasTrabalhadas(4);
        System.out.println("O cálculo de tributos para o serviço de " + servico1.getDescricao() + " é: " + servico1.calcularTributos());
    }
}