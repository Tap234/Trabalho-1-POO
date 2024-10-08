package questao4;

public class Triangulo {
    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public void existe (double area) {
        if (lado2 - lado3 < lado1 && lado1 - lado2 < lado3 && lado3 - lado1 < lado2) {
            
        }
    }
}
