package listasdeexercicios.enum_record_sealedclasses.exercicio3;

public class Teste {
    public static void main(String[] args) {
        Documento doc = new PDF("curriculo.pdf");

        if (doc instanceof PDF) {
            System.out.println("Abrindo no Adobe Reader: " + doc.getNome());
        } else if (doc instanceof Texto) {
            System.out.println("Abrindo no Bloco de Notas: " + doc.getNome());
        }
    }
}