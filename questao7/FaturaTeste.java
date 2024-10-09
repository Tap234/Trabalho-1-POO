package questao7;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("8965", "Teclado Gamer", -1, 75.50);
        System.out.println("A fatura 1 é: ");
        fatura.exibir();
        System.out.println("---------------------------");
        fatura.setQuantidade(8);
        fatura.setPreco(80.0);

        System.out.println("Parece que houveram mudanças, aqui estão os dados atualizados da fatura 1: ");
        fatura.exibir();
        System.out.println("---------------------------");

        Fatura fatura2 = new Fatura("1000", "Fone Gamer", 5, 60);
        System.out.println("A fatura 2 é: ");
        fatura2.exibir();
        System.out.println("---------------------------");

        Fatura fatura3 = new Fatura("6523", "Mouse Gamer", 4, 50);
        System.out.println("A fatura 3 é: ");
        fatura3.exibir();
    }
}
