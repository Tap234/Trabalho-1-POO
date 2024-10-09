package questao9;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria contaSimples = new ContaBancaria("João Silva", "12345", 1000.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria Oliveira", "54321", 1500.00, 5);
        ContaEspecial contaEspecial = new ContaEspecial("Carlos Pereira", "98765", 500.00, 1000.00);

        contaSimples.sacar(200.00);
        contaPoupanca.sacar(100.00);
        contaEspecial.sacar(1200.00);

        contaSimples.depositar(300.00);
        contaPoupanca.depositar(400.00);
        contaEspecial.depositar(200.00);

        System.out.println("\nDados da Conta Simples:");
        contaSimples.mostrarDadosConta();

        System.out.println("\nDados da Conta Poupança:");
        contaPoupanca.mostrarDadosConta();
        contaPoupanca.Rendimento(8);
        System.out.println("Novo saldo após rendimento:");
        contaPoupanca.mostrarDadosConta();

        System.out.println("\nDados da Conta Especial:");
        contaEspecial.mostrarDadosConta();
    }
}
