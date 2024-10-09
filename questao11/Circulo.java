package questao11;

public class Circulo implements AreaCalculavel {
    private double raio;
    private static final double PI = 3.14159265359;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return PI * raio * raio;
    }
}
