package RestauranteSaborArte;

public class PratoALaCarte extends Cardapio{

    public PratoALaCarte(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirCardapio(){
        System.out.println("\t===== RestauranteSabor&Arte =====\n");
        System.out.println("===== Prato ALaCarte =====\n");
        System.out.println("nome: "+nome);
        System.out.println("Preço: R$"+preco);
    }
}
