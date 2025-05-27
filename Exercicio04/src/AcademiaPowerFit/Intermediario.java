package AcademiaPowerFit;

public class Intermediario extends Planos{
    private String cadeira;

    public Intermediario(double mensalidade, String beneficios, String cadeira) {
        super(mensalidade, beneficios);
        this.cadeira = cadeira;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }

    @Override
    public void exibirPlanos(){
        System.out.println("\n===== Pacote Intermerdiário =====\n");
        System.out.println("Mensalidade: R$"+mensalidade);
        System.out.println("Benefícios: "+beneficios);
        System.out.println("Acesso: "+cadeira);
    }
}
