package Banco;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaBancaria banco = new ContaBancaria();
        int escolha;

        do{

            System.out.println("===== Menu =====\n");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver extrato");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            escolha = scanner.nextInt();

            switch(escolha) {

                case 1:
                System.out.println("Informe o valor do saque:");
                double valorSaque = scanner.nextDouble();
                banco.saque(valorSaque);
                break;

                case 2:
                    System.out.println("Informe o valor do deposito:");
                    double valorDeposito = scanner.nextDouble();
                    banco.deposito(valorDeposito);
                    break;

                case 3:
                    banco.exibirExtrato();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número inválido, digite entre 1-4!");
                    break;
            }

        }while(escolha != 4);

    }
}
