package exerciciosextras.enums_records_scanner.exercicio1;

import java.util.Scanner;

public class TesteAvaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Sistema de Feedback ---");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite uma nota de 1 a 4: ");
        int nota = scanner.nextInt();
        scanner.nextLine();

        StatusAvaliacao status = switch (nota) {
            case 4 -> StatusAvaliacao.EXCELENTE;
            case 3 -> StatusAvaliacao.BOM;
            case 2 -> StatusAvaliacao.REGULAR;
            case 1 -> StatusAvaliacao.RUIM;
            default -> {
                System.out.println("Nota fora do intervalo. Definindo como REGULAR.");
                yield StatusAvaliacao.REGULAR;
            }
        };

        Avaliacao feedback = new Avaliacao(nome, nota, status);

        System.out.println("\n--- Resumo da Avaliação ---");
        System.out.println(feedback);

        System.out.println("Obrigado pelo seu tempo, " + feedback.nomeCliente() + "!");

        scanner.close();
    }
}