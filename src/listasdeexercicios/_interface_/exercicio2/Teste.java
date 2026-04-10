package listasdeexercicios._interface_.exercicio2;

public class Teste {
    public static void main(String[] args) {
        Administrador administrador1 = new Administrador();
        administrador1.nome = "João";
        administrador1.realizarLogin("admin123");

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Ana";
        cliente1.realizarLogin("cliente456");
    }
}