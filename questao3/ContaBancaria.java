package questao3;

public class ContaBancaria {
    private String nc; // nc representa número da conta
    private String nome;
    private double saldo;

    public ContaBancaria (String nc, String nome, double saldo) {
        this.nc =  nc;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void deposito (Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado");
        } else {
            System.out.println("O valor deve ser positivo");
        }
    }
    public void  saque (Double valor) {
        if (valor >0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("O valor deve ser positivo");
        }
    }
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + nc);
        System.out.println("Saldo: " + saldo);
    }
    public void setNc (String nc) {
        this.nc = nc;
    }
    public String getNc () {
        return nc;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    public void setSaldo (Double saldo) {
        this.saldo = saldo;
    }
    public Double getSaldo () {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("7852146", "Sergio", 2);
        cb.deposito(0.0);
        cb.saque(2.0);
        cb.exibir();
    }
}
