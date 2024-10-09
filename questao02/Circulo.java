package questao02;

public class Circulo {
    private int raio;

    public Circulo (int raio) {
        this.raio = raio;
        
    }
    public void exibir() {
        System.out.println("Perimetro:" + raio * 2 * Math.PI + "cm" );
        System.out.println("Area:" + Math.pow(raio, 2) * Math.PI  + "cm quadrados" );
    }
    public int getRaio () {
        return raio;
    }
    public void setRaio (int raio) {
        this.raio =  raio;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        circulo.exibir();
    }
}
