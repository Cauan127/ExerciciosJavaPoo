package StreamingCinePlus;

public class Main{
    public static void main(String [] args){

        PlanoBasico basico = new PlanoBasico("Normal");
        PlanoFamilia familia = new PlanoFamilia("Normal","Múltiplos");
        PlanoPremium premium = new PlanoPremium("Full HD","Exclusivo","HBO MAX");

        basico.exibirAssinatura();
        familia.exibirAssinatura();
        premium.exibirAssinatura();

    }
}
