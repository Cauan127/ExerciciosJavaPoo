package RestauranteSaborArte;

public class Main {
    public static void main(String[] args){

        PratoALaCarte lacarte = new PratoALaCarte("Bife acebolado!",17.59);
        ComboPromocional promocao = new ComboPromocional("Picanha assada!",37.99,"30%");
        MenuDegustacao degustacao = new MenuDegustacao("Rodízio de carne",50.99,"Picanha, patinho, bisteca!");

    lacarte.exibirCardapio();
    promocao.exibirCardapio();
    degustacao.exibirCardapio();
    }
}
