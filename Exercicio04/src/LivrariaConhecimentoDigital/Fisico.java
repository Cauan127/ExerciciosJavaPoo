package LivrariaConhecimentoDigital;

public class Fisico extends Livros{
    private String offline;

    public Fisico(String nome, int ano, String autor, String offline) {
        super(nome, ano, autor);
        this.offline = offline;
    }

    public String getOffline() {
        return offline;
    }

    public void setOffline(String offline) {
        this.offline = offline;
    }

    @Override
    public void mostrarLivros(){
        System.out.println("===== Físico =====\n");
        System.out.println("Nome: "+nome);
        System.out.println("Ano: "+ano);
        System.out.println("Vantagem: "+offline);
    }
}
