package listasdeexercicios._interface_.exercicio5;

public class Carro extends Veiculo implements EmissorCarbono {
    @Override
    public void emitirGases() {
        System.out.println("Emitindo gases...");
    }

    @Override
    public void acelerar() {
        System.out.println("Vrum Vrum, estou acelerando!");
    }
}