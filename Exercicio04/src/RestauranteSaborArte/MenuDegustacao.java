package RestauranteSaborArte;

public class MenuDegustacao extends Cardapio{
    private String exclusivo;

    public MenuDegustacao(String nome, double preco, String exclusivo) {
        super(nome, preco);
        this.exclusivo = exclusivo;
    }

    public String getExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(String exclusivo) {
        this.exclusivo = exclusivo;
    }

    @Override
    public void exibirCardapio(){
        System.out.println("\n===== Menu degustação =====\n");
        System.out.println("nome: "+nome);
        System.out.println("Preço: R$"+preco);
        System.out.println("Degustações: "+exclusivo);
    }
}
