package PetShopFeliz;

public class Gatos extends Animais{
    private String ronronar;

    public Gatos(String nome, int idade, String ronronar) {
        super(nome, idade);
        this.ronronar = ronronar;
    }

    public String getRonronar() {
        return ronronar;
    }

    public void setRonronar(String ronronar) {
        this.ronronar = ronronar;
    }

    @Override
    public void servicos() {
        System.out.println( "\n===== Gatos =====\n");
        System.out.println("Nome: "+ getNome()+"\nIdade: "+getIdade()+"\n"+getRonronar());
    }
}
