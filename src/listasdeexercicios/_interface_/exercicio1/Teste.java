package listasdeexercicios._interface_.exercicio1;

public class Teste {
    public static void main(String[] args) {
        Email email1 = new Email();
        email1.enviarMensagem("Estou com problemas na plataforma X.");

        SMS SMS1 = new SMS();
        SMS1.enviarMensagem("Me ligue posteriormente.");
    }
}