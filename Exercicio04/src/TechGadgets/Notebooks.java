package TechGadgets;

public class Notebooks extends Eletronicos {
    private String processador;
    private String sistema;

    public Notebooks(String modelo, String marca, String cor, double valor, String processador, String sistema) {
        super(modelo, marca, cor, valor);
        this.processador = processador;
        this.sistema = sistema;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Override
    public void informacoesEletronico(){
        System.out.println("\tLoja TechGadgets\n");
        System.out.println("\n===== Notebook =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: "+valor);
        System.out.println("Processador: "+processador);
        System.out.println("Sistema operacional: "+sistema);
    }
}
