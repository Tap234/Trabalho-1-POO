package questao5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    private List<Double> numeros;

    // Construtor
    public Calculadora() {
        this.numeros = new ArrayList<>();
    }

    // Método para adicionar números à lista
    public void adicionarNumero(double numero) {
        this.numeros.add(numero);
    }

    // Método para somar todos os números
    public double somar() {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    // Método para subtrair todos os números a partir do primeiro
    public double subtrair() {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Nenhum número foi adicionado.");
        }

        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        return resultado;
    }

    // Método para multiplicar todos os números
    public double multiplicar() {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Nenhum número foi adicionado.");
        }

        double produto = 1;
        for (double numero : numeros) {
            produto *= numero;
        }
        return produto;
    }

    // Método para dividir os números a partir do primeiro
    public double dividir() {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Nenhum número foi adicionado.");
        }

        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                throw new ArithmeticException("Divisão por zero.");
            }
            resultado /= numeros.get(i);
        }
        return resultado;
    }

    // Método para limpar a lista de números
    public void limpar() {
        numeros.clear();
    }

    // Método main para testar a calculadora com entrada do usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        // Entrada de números
        System.out.println("Digite os números (digite 'next' para ir para as operações): ");
        while (true) {
            System.out.print("Digite um número: ");
            String input = scanner.next();
            
            if (input.equalsIgnoreCase("next")) {
                break;
            }
            try {
                double numero = Double.parseDouble(input);
                calc.adicionarNumero(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor digite um número válido.");
            }
        }

        // Seleção de operação
        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = calc.somar();
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair();
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar();
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                try {
                    resultado = calc.dividir();
                    System.out.println("Resultado da divisão: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}
