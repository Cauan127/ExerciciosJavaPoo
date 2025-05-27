package LojaOnline;

public class Pedido {
    private String cliente;
    private String produtos;
    private double valorTotal;


    public Pedido(){
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void calcularTotal(String cliente, String produtos, double valorTotal){
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public void exibirPedido(){
        System.out.println("\n===== Exibindo pedido =====\n");
        System.out.println("Seu id: "+cliente);
        System.out.println("Seu(s) produto(s): "+produtos);
        System.out.println("Valor total: R$"+valorTotal);
    }
}
