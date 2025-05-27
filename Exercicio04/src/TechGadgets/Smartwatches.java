package TechGadgets;

public class Smartwatches extends Eletronicos {
    private String tamanho;

    public Smartwatches(String modelo, String marca, String cor, double valor, String tamanho) {
        super(modelo, marca, cor, valor);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void informacoesEletronico(){
        System.out.println("\n===== Smartwatch =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: "+valor);
        System.out.println("Tela: "+tamanho);
    }
}
