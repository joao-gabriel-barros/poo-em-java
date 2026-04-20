package exerciciosextras.encapsulamento.exercicio1;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Lucas", 5000.0);
        System.out.println(c1);
        c1.depositar(500.0);
        System.out.println(c1);
        c1.sacar(150.0);
        System.out.println(c1);
        c1.sacar(10000.0);

        ContaBancaria c2 = new ContaBancaria("Ana");
        System.out.println(c2);
    }
}