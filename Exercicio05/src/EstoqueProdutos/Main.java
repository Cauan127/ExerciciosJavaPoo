package EstoqueProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produtos> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Exibir produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                produtos.add(new Produtos(nome, preco));
                System.out.println("Produto cadastrado!");
            }
            else if(opcao == 2){
                System.out.print("Nome do produto: ");
                String nomeBusca = sc.nextLine();
                Produtos products = buscarProduto(produtos, nomeBusca);
                if(products != null){
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = sc.nextInt();
                    products.adicionarEstoque(adicionar);
                }else{
                    System.out.println("Produto não encontrado!");
                }
            }

            else if(opcao == 3){
                System.out.print("Nome do produto: ");
                String nomeBusca = sc.nextLine();
                Produtos products = buscarProduto(produtos, nomeBusca);
                if(products != null){
                    System.out.print("Quantidade a remover: ");
                    int adicionar = sc.nextInt();
                    products.removerEstoque(adicionar);
                }else{
                    System.out.println("Produto não encontrado!");
                }
            }

            else if(opcao == 4){
                if (produtos.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado!");
                }else{
                    System.out.println("\n=== Produtos Cadastrados ===");
                    for(Produtos products : produtos){
                        System.out.println(products);
                    }
                }
            }
            else if(opcao == 5){
                System.out.println("Saindo...");
            }
            else{
                System.out.println("Opção inválida!");
            }
        }while(opcao != 5);

            }
            public static Produtos buscarProduto(ArrayList<Produtos> lista, String nome){
                for(Produtos products : lista){
                    if (products.getNome().equalsIgnoreCase(nome)){
                        return products;
                    }
                }
                return null;
            }
        }
