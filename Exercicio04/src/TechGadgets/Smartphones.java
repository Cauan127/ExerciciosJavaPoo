package TechGadgets;

public class Smartphones extends Eletronicos {
    private String chip;

    public Smartphones(String modelo, String marca, String cor, double valor, String chip) {
        super(modelo, marca, cor, valor);
        this.chip = chip;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    @Override
    public void informacoesEletronico(){
        System.out.println("\n===== Smartphone =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: "+valor);
        System.out.println("Chip: "+chip);
    }
}