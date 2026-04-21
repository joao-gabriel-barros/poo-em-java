package exerciciosextras.exceptions.exercicio2;

public class Cadastro {
    void validarCadastro(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Não é possível validar cadastro de menores de 18 anos.");
        } else {
            System.out.println("Cadastro realizado com sucesso!");
        }
    }
}