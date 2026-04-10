package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio3;

public class Teste {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso();
        ingresso1.valorBase = 100.0;
        System.out.println("Valor do ingresso padrão: " + ingresso1.calcularValorFinal());

        IngressoVIP ingressoVIP1 = new IngressoVIP();
        ingressoVIP1.valorBase = 100.0;
        ingressoVIP1.setAdicional(150.0);
        System.out.println("O valor do ingresso VIP é: " + ingressoVIP1.calcularValorFinal());

        IngressoEstudante ingressoEstudante1 = new IngressoEstudante();
        ingressoEstudante1.valorBase = 100;
        System.out.println("O valor do ingresso para estudantes é: " + ingressoEstudante1.calcularValorFinal());
    }
}