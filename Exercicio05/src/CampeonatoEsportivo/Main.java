package CampeonatoEsportivo;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("Informe o nome do time:");
        String nomeTime = scanner.nextLine();
        Time time = new Time(nomeTime);

        do{

            System.out.println("\n===== Time: " +nomeTime+ " =====");
            System.out.println("1. Adicionar jogador");
            System.out.println("2. Remover jogador");
            System.out.println("3. Listar jogadores");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opções acima:");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){

                case 1:
                    System.out.println("Informe o nome do jogador:");
                    String adicionarJogador = scanner.nextLine();
                    time.acrescentarJogador(adicionarJogador);
                    break;

                case 2:
                    System.out.println("Nome do jogador para remoção:");
                    String removerJogador = scanner.nextLine();
                    time.tirarJogador(removerJogador);
                    break;

                case 3:
                    time.listarJogadores();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número ou caracter inválido!");
                    break;
            }

        }while(escolha != 4);
    }
}
