package CategoriasFixasLivros;

public class Main{
    public static void main(String[] args){

        Livro livro01 = new Livro("Game of Thrones","George R.R Martin",Categoria.Medieval);
        Livro livro02 = new Livro("1984","Oswald Owell",Categoria.Historia);

        livro01.exibirLivro();
        System.out.println("\n");
        livro02.exibirLivro();
    }
}
