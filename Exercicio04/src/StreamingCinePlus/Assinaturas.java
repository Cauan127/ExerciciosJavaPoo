package StreamingCinePlus;

public abstract class Assinaturas {
    protected String qualidade;

    public Assinaturas(String qualidade) {
        this.qualidade = qualidade;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    public abstract void exibirAssinatura();
}
