package TechGadgets;

public abstract class Eletronicos {
    protected String modelo;
    protected String marca;
    protected String cor;
    protected double valor;

    public Eletronicos(String modelo, String marca, String cor, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void informacoesEletronico();
}
