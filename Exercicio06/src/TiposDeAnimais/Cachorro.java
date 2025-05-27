package TiposDeAnimais;

public class Cachorro extends Animais{

    public Cachorro(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void emitirSom(){
        System.out.println("===== Cachorro =====");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println(getSom());
    }
}
