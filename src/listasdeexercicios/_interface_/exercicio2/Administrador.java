package listasdeexercicios._interface_.exercicio2;

public class Administrador extends Usuario implements Autenticavel {
    @Override
    public boolean realizarLogin(String senha) {
        if (senha.equals("admin123")) {
            System.out.println("Login efetuado!");
            return true;
        } else {
            System.out.println("Não foi possível realizar o login.");
            return false;
        }
    }
}