package questao8;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Caio","Teixeira" , 2400);
        Empregado empregado2 = new Empregado("Amanda","Barbosa" , 3500);

        empregado1.exibir();
        empregado2.exibir();
        System.out.println("-----------------------");

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("Após o aumento");
        empregado1.exibir();
        empregado2.exibir();
    }
}
