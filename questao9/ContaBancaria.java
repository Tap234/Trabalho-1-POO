package questao9;

public class ContaBancaria {
    protected String nomeCliente;
    protected String numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double depositar(double deposito) {
        if (deposito > 0 ) {
            return (saldo += deposito);
        } else {
            System.out.println("O deposito deve ser positivo");
            return 0;
        }
    }

    public double sacar(double saque) {
        if (saque < saldo && saque > 0) {
            return (double) (saldo -= saque);
        } else {
            System.out.println("Saldo insuficiente para saque");
            return 0;
        }
    }

    public void setNomeCliente (String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getNomeCliente () {
        return nomeCliente;
    }
    public void setNumConta (String numConta) {
        this.numConta = numConta;
    }
    public String getNumConta () {
        return numConta;
    }
    public void setSaldo (Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo () {
        return saldo;
    }

    public void mostrarDadosConta() {
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Número da Conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }
}
