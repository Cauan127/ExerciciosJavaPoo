package TiposDeAnimais;

public class Main{
    public static void main(String[] args){

        Cachorro cao = new Cachorro("Rex trovão",7,"Au Au!");
        Gato gato = new Gato("Rodolfo",12,"Miauuu!");
        Cabra cabrito = new Cabra("Loro José",4,"BÉÉÉÉÉÉÉ!");

        System.out.println("\t===== Animais =====\n");
        cao.emitirSom();
        gato.emitirSom();
        cabrito.emitirSom();
    }
}
