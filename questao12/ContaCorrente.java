package questao12;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;  // 1% do saldo
    }
}
