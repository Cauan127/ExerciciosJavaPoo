package BancoDeDados;

public class Main {
    public static void main(String[] args) {
        ConexaoDados entrada1 = ConexaoDados.getIstancia();
        ConexaoDados entrada2 = ConexaoDados.getIstancia();

        entrada1.conectando();

        if (entrada1 != entrada2) {
            System.out.println("\nUtilizando a mesma instância!");
        } else {
            System.out.println("Instâncias paralelas!\n");
        }
    }
}
