package PetShopFeliz;

public class Main {
    public static void main(String[] args) {

        Animais cachorro = new Caes("Maledito", 4,"Au Au!");
        Animais gato = new Gatos("Mimi", 3,"Rrrr!");
        Animais passaro = new Passaros("Piu", 2,"Voando");

        System.out.println("PetShopFeliz:\n");
        cachorro.servicos();
        gato.servicos();
        passaro.servicos();
    }
}
