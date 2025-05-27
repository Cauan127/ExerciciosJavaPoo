package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<ItemBiblioteca> itens = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public void mostrarDisponiveis(){
        System.out.println("\n===== Disponíveis =====");
        for (ItemBiblioteca item : itens){
            if (!item.isEmprestadoOuNao()){
                item.exibirInformacoes();
            }
        }
    }

    public void mostrarEmprestados(){
        System.out.println("\n===== Emprestados =====");
        for (ItemBiblioteca item : itens){
            if (item.isEmprestadoOuNao()){
                item.exibirInformacoes();
            }
        }
    }

    public void emprestarItem(String titulo){
        for (ItemBiblioteca item : itens){
            if (item.getTitulo().equalsIgnoreCase(titulo) && !item.isEmprestadoOuNao()){
                item.emprestar();
                System.out.println("Livro emprestado: " + titulo);
                return;
            }
        }
        System.out.println("Livro foi emprestado ou não existe aqui!");
    }

    public void devolverItem(String titulo){
        for (ItemBiblioteca item : itens){
            if (item.getTitulo().equalsIgnoreCase(titulo) && item.isEmprestadoOuNao()){
                item.devolver();
                System.out.println("Item devolvido: " + titulo);
                return;
            }
        }
        System.out.println("Livro foi emprestado ou não existe aqui!");
    }
}