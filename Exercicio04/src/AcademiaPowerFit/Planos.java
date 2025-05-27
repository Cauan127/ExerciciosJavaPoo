package AcademiaPowerFit;

public abstract class Planos {
    protected double mensalidade;
    protected String beneficios;

    public Planos(double mensalidade, String beneficios) {
        this.mensalidade = mensalidade;
        this.beneficios = beneficios;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public abstract void exibirPlanos();
}