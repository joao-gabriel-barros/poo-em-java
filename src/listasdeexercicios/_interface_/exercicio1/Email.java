package listasdeexercicios._interface_.exercicio1;

public class Email implements Mensageiro {
    @Override
    public void enviarMensagem(String texto) {
        System.out.println("Enviando o email: " + texto);
    }
}