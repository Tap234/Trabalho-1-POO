package questao7;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this. quantidade = (quantidade > 0) ? quantidade : 0;
        this.preco = (preco > 0) ? preco : 0.0;
    }
    public void setQuantidade(int quantidade) {
        this. quantidade = (quantidade > 0) ? quantidade : 0;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setDescraicao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }

    public void setPreco(double preco) {
        this.preco = (preco > 0) ? preco : 0.0;
    }
    public double getPreco() {
        return preco;
    }

    public double getTotalFatura() {
        return quantidade * preco;
    }

    public void exibir() {
        System.out.println("O número é: " + numero);
        System.out.println("Descrição: " + descricao);
        System.out.println("A quantidade comprada é: " + quantidade);
        System.out.println("O preço individual é: " + preco);
        System.out.println("O total é: " + getTotalFatura());
    }
}
