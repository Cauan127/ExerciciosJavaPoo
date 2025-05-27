package LivrariaConhecimentoDigital;

public class Main{
    public static void main(String[] args){

        Fisico fisico = new Fisico("Game of Thrones",2013,"Tauriel Myph","Podendo ser levado a qualquer lugar!");
        eBook digital = new eBook("The Hobbit",1990,"Tolkien","Sua disponibilidade","Levando um, leve mais outro de brinde");
       AudioBook ouvir = new AudioBook("1984",1950,"Orwell","Leve um fone de brinde");

       fisico.mostrarLivros();
       digital.mostrarLivros();
       ouvir.mostrarLivros();
    }
}
