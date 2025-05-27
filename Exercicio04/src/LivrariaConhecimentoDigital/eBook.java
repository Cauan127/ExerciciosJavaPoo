package LivrariaConhecimentoDigital;

public class eBook extends Livros{
    private String online;
    private String descontos;

    public eBook(String nome, int ano, String autor, String online, String descontos) {
        super(nome, ano, autor);
        this.online = online;
        this.descontos = descontos;
    }

    public String getDescontos() {
        return descontos;
    }

    public void setDescontos(String descontos) {
        this.descontos = descontos;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    @Override
    public void mostrarLivros(){
        System.out.println("\n===== E-Book =====\n");
        System.out.println("Nome: "+nome);
        System.out.println("Ano: "+ano);
        System.out.println("Vantagem: "+online);
        System.out.println("Exclusividade: "+descontos);
    }
}
