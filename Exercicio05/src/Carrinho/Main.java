package Carrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras("Meu Carrinho");

        int opcao;

        do {

            System.out.println("\n===== MENU DO CARRINHO =====");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Listar produtos");
            System.out.println("4. Calcular total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do produto: R$ ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    carrinho.adicionarItem(nome, preco);
                    break;

                case 2:
                    System.out.print("Nome do produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    carrinho.tirarProduto(nomeRemover);
                    break;

                case 3:
                    carrinho.listarItens();
                    break;

                case 4:
                    double total = carrinho.calcularTotal();
                    System.out.println("Total do carrinho: R$"+total);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while(opcao != 5);

    }
}