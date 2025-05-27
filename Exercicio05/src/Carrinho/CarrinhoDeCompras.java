package Carrinho;

import java.util.ArrayList;

public class CarrinhoDeCompras{
    private ArrayList<Item> produto;

    public CarrinhoDeCompras(String nome){
        this.produto = new ArrayList<>();
    }

    public ArrayList<Item> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Item> produto) {
        this.produto = produto;
    }

    public void adicionarItem(String nome, double preco){
        produto.add(new Item(nome,preco));
        System.out.println("Produto adicionado ao carrinho!");
    }

    public void tirarProduto(String nome){
        for (Item item : produto) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                produto.remove(item);
                System.out.println("Produto removido do carrinho!");
            }
        }
    }

        public void listarItens(){
            System.out.println("===== Produtos =====\n");
            if (produto.isEmpty()) {
                System.out.println("Sem produto(s) no carrinho!");
            } else {
                for (Item item : produto) {
                    System.out.println("--> " + item.getNome() + "\nR$" + item.getPreco());
                }
            }
        }

        public double calcularTotal(){
            double tudo = 0;
            for (Item item : produto) {
                tudo += item.getPreco();
            }
            return tudo;
        }
    }
