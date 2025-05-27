package TiposDeAnimais;

public class Gato extends Animais {

    public Gato(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    @Override
    public void emitirSom(){
        System.out.println("\n===== Gato =====");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println(getSom());
    }
}
