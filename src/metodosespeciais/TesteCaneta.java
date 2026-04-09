package metodosespeciais;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c = new Caneta("Bic", "Azul", 0.6f);
        c.setModelo("Castel");
        c.setCor("Vermelho");
        c.setPonta(1.0f);
        System.out.println("A caneta é do modelo: " + c.getModelo());
        System.out.println("A caneta é da cor: " + c.getCor());
        System.out.println("A caneta possui a ponta: " + c.getPonta());
    }
}