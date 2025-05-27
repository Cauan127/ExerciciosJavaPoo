package LivrariaConhecimentoDigital;

public class AudioBook extends Livros {
    private String fones;

    public AudioBook(String nome, int ano, String autor, String fones) {
        super(nome, ano, autor);
        this.fones = fones;
    }

    public String getFones() {
        return fones;
    }

    public void setFones(String fones) {
        this.fones = fones;
    }

    public void mostrarLivros(){
        System.out.println("\n===== AudioBook =====\n");
        System.out.println("Nome: "+nome);
        System.out.println("Ano: "+ano);
        System.out.println("Portabilidade: "+fones);
    }
}
