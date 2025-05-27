package PetShopFeliz;

public class Caes extends Animais{
    private String latir;

    public Caes(String nome, int idade, String latir) {
        super(nome, idade);
        this.latir = latir;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }

    @Override
    public void servicos() {
        System.out.println( "===== Cães =====\n");
        System.out.println("Nome: "+ getNome()+"\nIdade: "+getIdade()+"\n"+getLatir());
    }
}
