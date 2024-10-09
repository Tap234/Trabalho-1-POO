package questao9;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double Limite(double limite) {
        if (saldo < 0 && limite > 0) {
            return (double) (saldo -= limite);
        } else {
            System.out.println("O limite deve ser positivo");
            return 0;
        }
    }
}
