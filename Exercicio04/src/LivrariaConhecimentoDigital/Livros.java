package LivrariaConhecimentoDigital;

public abstract class Livros {
    protected String nome;
    protected int ano;
    protected String autor;

    public Livros(String nome, int ano, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public abstract void mostrarLivros();
}
