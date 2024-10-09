package questao8;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome,  String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public double GetSalarioAnual() {
        return  12 * salario;
    }

    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * (porcentagem / 100);
        }
    }

    public void exibir() {
        System.out.println("O salário anual de " + nome + " " + sobrenome + " é: R$ " + GetSalarioAnual());
    }
}
