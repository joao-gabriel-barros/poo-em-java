package listasdeexercicios.heranca_polimorfismo_relacionamentos.exercicio1;

public class Teste {
    public static void main(String[] args) {
        Publicacao l1 = new Livro("Diário de Banana", "Francisco", 1990, 532);
        Publicacao r1 = new Revista("Vogue", "Ana", 2026, "09/04/2026");
        System.out.println("---Livro 1---");
        System.out.println(l1);
        System.out.println("---Revista 1---");
        System.out.println(r1);
    }
}