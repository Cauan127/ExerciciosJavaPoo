package RegistroDePedidos;

import java.util.ArrayList;

public class Pedido{
    private ArrayList<Item> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void removerItem(String nome){
        boolean removido = false;

        for(int i = 0; i < itens.size(); i++){
            if(itens.get(i).getNome().equalsIgnoreCase(nome)){
                itens.remove(i);
                System.out.println("Item removido!");
                removido = true;
                break;
            }
        }
        if(!removido){
            System.out.println("Item não encontrado!");
        }
    }

    public void listarItens(){
        if(itens.isEmpty()){
            System.out.println("Nenhum item!");
        }else{
            System.out.println("Itens no pedido:");
            for (Item item : itens){
                System.out.println(" "+item.getNome()+" --> R$" + item.getPreco());
            }
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.getPreco();
        }
        return total;
    }
}