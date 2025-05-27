package RestauranteSaborArte;

public class ComboPromocional extends Cardapio{
    private String desconto;

    public ComboPromocional(String nome, double preco, String desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    @Override
    public void exibirCardapio(){
        System.out.println("\n===== Combo promocional =====\n");
        System.out.println("nome: "+nome);
        System.out.println("Preço: R$"+preco);
        System.out.println("Desconto de até "+desconto);
    }
}
