package AcademiaPowerFit;

public class Basico extends Planos{

    public Basico(double mensalidade, String beneficios) {
        super(mensalidade, beneficios);
    }

    @Override
    public void exibirPlanos(){
        System.out.println("\t===== Planos =====\n");
        System.out.println("===== Pacote Básico =====\n");
        System.out.println("Mensalidade: R$"+mensalidade);
        System.out.println("Benefícios: "+beneficios);
    }
}
