package exerciciosextras.enums_records_scanner.exercicio2;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Digite o valor base do produto: ");
        double valorBaseProduto = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a categoria: 1 = Eletrônicos, 2 = Vestuário, 3 = Alimentos.");
        int categoriaEscolhida = sc.nextInt();
        sc.nextLine();

        Categoria categoria = switch (categoriaEscolhida) {
            case 1 -> Categoria.ELETRONICOS;
            case 2 -> Categoria.VESTUARIO;
            case 3 -> Categoria.ALIMENTOS;
            default -> throw new IllegalArgumentException("Valor inválido, escolha 1, 2 ou 3.");
        };

        Produto p1 = new Produto(nomeProduto, valorBaseProduto, categoria);

        System.out.println("O valor do " + p1.nome() + " com imposto é: " + p1.calcularPrecoFinal());

        sc.close();
    }
}