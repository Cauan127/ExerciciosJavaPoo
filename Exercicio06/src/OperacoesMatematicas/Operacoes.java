package OperacoesMatematicas;

public class Operacoes{

    public double adicao(double x, double y) {
        return x + y;
    }

    public double subtracao(double x, double y) {
        return x - y;
    }

    public double multiplicacao(double x, double y) {
        return x * y;
    }

    public double divisao(double x, double y) {
        if (y == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
        return x / y;
    }
}
