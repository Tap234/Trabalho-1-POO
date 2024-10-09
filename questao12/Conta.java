package questao12;

public abstract class Conta {
    protected double saldo;

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}
