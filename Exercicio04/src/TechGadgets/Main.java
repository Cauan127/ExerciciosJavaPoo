package TechGadgets;

public class Main {
    public static void main(String[] args){

        Notebooks notebook = new Notebooks("Ideapad 3i", "Lenovo","Prateado", 2530,"I5 10034k","Windows 10 home");
        Smartphones celular = new Smartphones("A34", "Samsung","Azul",1600,"Vivo");
        Smartwatches relogio = new Smartwatches("Hallux","VictorLux","Preto",5024,"Médio");

        notebook.informacoesEletronico();
        celular.informacoesEletronico();
        relogio.informacoesEletronico();
    }
}
