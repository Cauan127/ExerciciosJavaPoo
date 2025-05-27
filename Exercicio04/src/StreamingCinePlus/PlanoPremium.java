package StreamingCinePlus;

public class PlanoPremium extends Assinaturas{
    private String conteudo;
    private String antecipado;

    public PlanoPremium(String qualidade, String conteudo, String antecipado) {
        super(qualidade);
        this.conteudo = conteudo;
        this.antecipado = antecipado;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAntecipado() {
        return antecipado;
    }

    public void setAntecipado(String antecipado) {
        this.antecipado = antecipado;
    }

    @Override
    public void exibirAssinatura(){
        System.out.println("\n===== Premium =====\n");
        System.out.println("Filmes e séries");
        System.out.println("Qualidade: "+qualidade);
        System.out.println("Contéudo em "+conteudo);
        System.out.println("Acesso a filmes e séries: "+antecipado);
    }
}
