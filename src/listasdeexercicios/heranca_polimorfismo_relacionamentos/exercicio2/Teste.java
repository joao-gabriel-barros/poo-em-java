package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio2;

public class Teste {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao("LNJ1626", 4.5, 6);
        System.out.println("Pedágio do caminhão: R$ " + caminhao1.calcularPedagio());

        CarroPasseio carroPasseio1 = new CarroPasseio("LUP1818", 1.5);
        System.out.println("Pedágio do carro de passeio: R$ " + carroPasseio1.calcularPedagio());
    }
}