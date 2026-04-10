package listasdeexercicios._interface_.exercicio4;

public class DocumentoWord implements Imprimivel, Salvavel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void salvar() {
        System.out.println("Salvando documento...");
    }
}