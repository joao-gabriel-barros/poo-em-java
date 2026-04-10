package listasdeexercicios._interface_.exercicio2;

public class Cliente extends Usuario implements Autenticavel {
    @Override
    public boolean realizarLogin(String senha) {
        if (senha.equals("cliente123")) {
            System.out.println("Login efetuado!");
            return true;
        } else {
            System.out.println("Não foi possível realizar o login.");
            return false;
        }
    }
}