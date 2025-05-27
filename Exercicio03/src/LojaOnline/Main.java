package LojaOnline;

public class Main {
    public static void main(String[] args){

        Produto produto = new Produto();
        produto.comprar("Xbox",2000,10);
        produto.exibirDetalhes();

        Cliente cliente = new Cliente();
        cliente.fazerPedido("Geraldo fonseca","geraldofonseca127@gmail.com","Rua côrrea");
        cliente.exibirDados();

        Pedido pedido = new Pedido();
        pedido.calcularTotal("213233-2", "Xbox", 2000);
        pedido.exibirPedido();
    }
}
