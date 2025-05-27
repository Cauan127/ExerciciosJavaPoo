package SistemaBiblioteca;

public class ItemBiblioteca {
    private String titulo;
    private boolean emprestadoOuNao;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
        this.emprestadoOuNao = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestadoOuNao() {
        return emprestadoOuNao;
    }

    public void emprestar(){
        emprestadoOuNao = true;
    }

    public void devolver(){
        emprestadoOuNao = false;
    }

    public void setEmprestadoOuNao(boolean emprestadoOuNao) {
        this.emprestadoOuNao = emprestadoOuNao;
    }

    public void exibirInformacoes(){
        System.out.println("Título: "+titulo);
    }
}
