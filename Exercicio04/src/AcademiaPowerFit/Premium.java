package AcademiaPowerFit;

public class Premium extends Planos{
    private String exclusive;

    public Premium(double mensalidade, String beneficios, String exclusive) {
        super(mensalidade, beneficios);
        this.exclusive = exclusive;
    }

    public String getExclusive() {
        return exclusive;
    }

    public void setExclusive(String exclusive) {
        this.exclusive = exclusive;
    }

    @Override
    public void exibirPlanos(){
        System.out.println("\n===== Pacote Premium =====\n");
        System.out.println("Mensalidade: R$"+mensalidade);
        System.out.println("Benefícios: "+beneficios);
        System.out.println("Exclusividade: "+exclusive);
    }
}
