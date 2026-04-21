package exerciciosextras.exceptions.exercicio2;

public class TesteCadastro {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        try {
            cadastro.validarCadastro("João", 15);
        } catch (IdadeInvalidaException e) {
            System.err.println("Idade Inválida. " + e.getMessage());
        }
    }
}