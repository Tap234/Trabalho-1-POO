package questao12;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000.0);

        System.out.println("Saldo ContaCorrente: " + cc.obterSaldo());
        System.out.println("Tributos ContaCorrente: " + cc.calculaTributos());

        SeguroDeVida seguro = new SeguroDeVida();
        System.out.println("Tributos SeguroDeVida: " + seguro.calculaTributos());
    }
}
