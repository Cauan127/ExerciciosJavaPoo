package Biblioteca;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Estante biblioteca = new Estante();
        int escolha;

        do{
            System.out.println("\n===== Menu =====");
            System.out.println("1 - Adicionar livro(s)");
            System.out.println("2 - Remover livro(s)");
            System.out.println("3 - Mostrar livro(s)");
            System.out.println("4 - Sair");
            System.out.println("Escolha umas das opções: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){

                case 1:
                    System.out.println("Informe o nome do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Informe o nome do autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Informe código(ISBN):");
                    String isbn = scanner.nextLine();
                    biblioteca.lerLivro(new Livro(titulo, autor, isbn));
                    System.out.println("Livro foi adicionado!");
                    break;

                case 2:
                    System.out.println("Informe o livro que deseja remover: ");
                    String tirarLivros = scanner.nextLine();
                    biblioteca.tirarLivro(tirarLivros);
                    break;

                case 3:
                    biblioteca.exibirLivros();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Número inválido, tente outro!");
            }

        }while(escolha != 4);
    }
}
