package questao9;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void Rendimento(double render) {
        if (render > 0) {
            saldo += saldo * (render / 100);
            System.out.println("Rendimento aplicado. Novo saldo é de: R$" + saldo);
        } else {
            System.out.println("Taxa inválida");
        }
    }


}
