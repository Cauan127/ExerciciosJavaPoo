package SistemaBiblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        biblioteca.adicionarItem(new ItemBiblioteca("Game of Thrones"));
        biblioteca.adicionarItem(new ItemBiblioteca("O Silmarillion"));
        biblioteca.adicionarItem(new ItemBiblioteca("Barbie"));

        do {
            System.out.println("\n===== Biblioteca =====");
            System.out.println("1 - Mostrar disponíveis");
            System.out.println("2 - Mostrar emprestados");
            System.out.println("3 - Emprestar item");
            System.out.println("4 - Devolver item");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    biblioteca.mostrarDisponiveis();
                    break;

                case 2:
                    biblioteca.mostrarEmprestados();
                    break;

                case 3:
                    System.out.print("Nome do livro para emprestar: ");
                    String emprestar = scanner.nextLine();
                    biblioteca.emprestarItem(emprestar);
                    break;

                case 4:
                    System.out.print("Nome do livro para devolver: ");
                    String devolver = scanner.nextLine();
                    biblioteca.devolverItem(devolver);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Erro, tente novamente!");
                    break;
            }

        } while (escolha != 5);
    }
}
