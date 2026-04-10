package listasdeexercicios._interface_.exercicio5;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");

        System.out.println("O " + carro1.getModelo() + " da marca " + carro1.getMarca() + " vai acelerar!");
        carro1.acelerar();
        carro1.emitirGases();
    }
}