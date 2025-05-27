package PetShopFeliz;

public class Passaros extends Animais{
    private String voar;

        public Passaros(String nome, int idade ,String voar) {
            super(nome, idade);
            this.voar = voar;
        }

    public String getVoar() {
        return voar;
    }

    public void setVoar(String voar) {
        this.voar = voar;
    }

    @Override
        public void servicos() {
        System.out.println( "===== Passaro =====\n");
        System.out.println("Nome: "+ getNome()+"\nIdade: "+getIdade()+"\n"+getVoar());
        }
    }