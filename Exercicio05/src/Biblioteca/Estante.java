package Biblioteca;

import java.util.ArrayList;

public class Estante{
    private ArrayList<Livro> livros;

    public Estante(){
        livros = new ArrayList<>();
    }

 public void lerLivro(Livro livro){
        livros.add(livro);
  }

  public void tirarLivro(String titulo){
        boolean remover = false;

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(i);
                System.out.println("Livro removido!");
                remover = true;
                break;
            }
        }
        if(!remover){
            System.out.println("Não foi encontrado!");
        }
   }

   public void exibirLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro foi adicionado!");
        }else{
            System.out.println("\t---Livros ---\n");
            for(Livro livro : livros){
                System.out.println("-------------\n"+livro.getTitulo()+"\n"+livro.getAutor()+"\n"+livro.getIsbn()+"\n-------------\n");
            }
        }
   }
}
