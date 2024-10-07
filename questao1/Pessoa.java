package questao1;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public int calcularIdadeBissextos() {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int anoNascimento = anoAtual - idade;
        int anosBissextos = 0;

        for (int i = anoNascimento; i <= anoAtual; i++) {
            if (isAnoBissexto(i)) {
                anosBissextos++;
            }
        }
        return anosBissextos;
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissao: " + profissao);
        System.out.println("Anos vividos em anos bissextos: " + calcularIdadeBissextos());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 30, "Engenheiro");
        pessoa.exibirInformacoes();
    }
}
