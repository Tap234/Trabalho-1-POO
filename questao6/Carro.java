package questao6;

public class Carro {
    private String placa;
    private int marcha;

    public Carro(String placa) {
        this.placa = placa;
        this.marcha = 0;
    }
    public void ligar() {
        System.out.println("O carro está ligado");
    }
    public void trocarMarcha(int marcha) {
        this.marcha = marcha;
        System.out.println("Marcha trocada para: " + marcha);
    }
    public void acelerar() {
        if (marcha > 0) {
            System.out.println("O caro está acelerando na marcha: " + marcha);
        } else {
            System.out.println("Nao se deve acelerar na marcha 0");
        }
    }
    public void frear() {
        System.out.println("O carro está freado");
    }
    public void desligar() {
        System.out.println("O carro está desligado");
    }
    
}
