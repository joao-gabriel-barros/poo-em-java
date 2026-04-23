package exerciciosextras.enums_records_scanner.exercicio2;

public enum Categoria {
    ELETRONICOS(0.15),
    VESTUARIO(0.05),
    ALIMENTOS(0.02);

    private final double imposto;

    Categoria(double imposto) {
        this.imposto = imposto;
    }

    public double getImposto() {
        return imposto;
    }
}