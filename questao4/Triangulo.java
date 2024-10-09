package questao4;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean isValido() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public double calcularArea() {
        if (!isValido()) {
            System.out.println("Os lados não formam um triângulo válido.");
            return 0;
        }

        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 7, 9);

        if (triangulo.isValido()) {
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }
}

