package questao06;

public class PessoaCarro {
    private String nome;
    private Carro meuCarro;

    public PessoaCarro(String nome, Carro meuCarro) {
        this.nome = nome;
        this.meuCarro = meuCarro;
    }
    public void ligarCarro() {
        System.out.println(nome + " está tentando ligando o carro.");
        System.out.println(nome + " ligou o carro.");
        meuCarro.ligar();
    }
    public void trocarMarcha(int marcha) {
        System.out.println(nome + " trocou a marcha para: " + marcha);
        meuCarro.trocarMarcha(marcha);
    }
    public void acelerar() {
        System.out.println(nome + " está acelerando o carro.");
        meuCarro.acelerar();
    }
    public void frear() {
        System.out.println(nome + " está freando o carro.");
        meuCarro.frear();
    }
    public void desligarCarro() {
        System.out.println(nome + " está desligando o carro.");
        meuCarro.desligar();
    }

    public static void main(String[] args) {
        Carro carro = new Carro("BAU-0978");
        PessoaCarro pessoa = new PessoaCarro("Pedro", carro);

        pessoa.ligarCarro();
        pessoa.trocarMarcha(1);
        pessoa.acelerar();
        pessoa.trocarMarcha(2);
        pessoa.acelerar();
        pessoa.trocarMarcha(3);
        pessoa.acelerar();
        pessoa.trocarMarcha(4);
        pessoa.acelerar();
        pessoa.frear();
        pessoa.desligarCarro();
    }
}