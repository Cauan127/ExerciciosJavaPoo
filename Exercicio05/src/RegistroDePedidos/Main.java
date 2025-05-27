package RegistroDePedidos;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        int opcao;

        do{
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. mostrar item(s)");
            System.out.println("4. preço total do(s) pedido(s)");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.println("Preço do item: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    pedido.adicionarItem(new Item(nome, preco));
                    System.out.println("Item adicionado!");
                    break;

                case 2:
                    System.out.println("Nome do item a remover: ");
                    String nomeRemover = scanner.nextLine();
                    pedido.removerItem(nomeRemover);
                    break;

                case 3:
                    pedido.listarItens();
                    break;

                case 4:
                    System.out.println("Total do pedido: R$"+pedido.calcularTotal());
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                    default:
                    System.out.println("Opção invalida, tente de novo!");
            }

        }while (opcao != 5);

    }
}
