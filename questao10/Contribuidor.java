package questao10;

import java.util.Scanner;

abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }
}

class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta <= 2100) {
            return rendaBruta * 0.10 - 100;
        } else if (rendaBruta <= 2800) {
            return rendaBruta * 0.15 - 270;
        } else if (rendaBruta <= 3600) {
            return rendaBruta * 0.25 - 500;
        } else {
            return rendaBruta * 0.30 - 700;
        }
    }
}

class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return rendaBruta * 0.10;
    }
}

public class Contribuidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contribuinte[] contribuintes = new Contribuinte[6];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da Pessoa Jurídica " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a renda bruta da empresa: ");
            double renda = scanner.nextDouble();
            scanner.nextLine();
            contribuintes[i] = new PessoaJuridica(nome, renda);
        }

        for (int i = 3; i < 6; i++) {
            System.out.print("Digite o nome da Pessoa Física " + (i - 2) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite a renda bruta da pessoa: ");
            double renda = scanner.nextDouble();
            scanner.nextLine();
            contribuintes[i] = new PessoaFisica(nome, renda);
        }

        System.out.println("\nImpostos a serem pagos:");
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte.getNome() + " deverá pagar: R$ " + contribuinte.calcularImposto());
        }

        scanner.close();
    }
}
