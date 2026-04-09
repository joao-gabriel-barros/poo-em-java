package exemplopratico;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setNumConta(1234);
        c1.setDono("João");
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.estadoAtual();

        Conta c2 = new Conta();
        c2.setNumConta(5678);
        c2.setDono("Ana");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.estadoAtual();
    }
}