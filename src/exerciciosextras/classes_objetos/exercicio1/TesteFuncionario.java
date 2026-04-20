package exerciciosextras.classes_objetos.exercicio1;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 800.0, 89.90);
        System.out.println(f1);
        f1.setSalarioBruto(1800.0);
        f1.setImposto(200.0);
        System.out.println(f1);
        System.out.println("O salário líquido é: ");
        f1.calcularSalarioLiquido();
    }
}