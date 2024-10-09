package questao11;

public class Area {
    public static void main(String[] args) {
        AreaCalculavel quadrado = new Quadrado(5);
        AreaCalculavel retangulo = new Retangulo(4, 6);
        AreaCalculavel circulo = new Circulo(3);

        System.out.println("Área do quadrado: " + quadrado.calculaArea());
        System.out.println("Área do retângulo: " + retangulo.calculaArea());
        System.out.println("Área do círculo: " + circulo.calculaArea());
    }
}
