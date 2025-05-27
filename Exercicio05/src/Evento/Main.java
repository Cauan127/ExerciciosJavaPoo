package Evento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evento evento = new Evento();
        int escolha;

        do{

            System.out.println("\n1. Adicionar participante");
            System.out.println("2. Listar participantes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tipo de ingresso: ");
                    String tipoIngresso = scanner.nextLine();

                    Participante primario = new Participante(nome, idade, tipoIngresso);
                    evento.adicionarParticipante(primario);
                    break;

                case 2:
                    evento.listarParticipantes();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Erro, tente um número de 1-3!");
            }
        } while (escolha != 3);

    }
}
