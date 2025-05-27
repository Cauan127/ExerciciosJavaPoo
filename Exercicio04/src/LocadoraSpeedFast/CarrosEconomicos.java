package LocadoraSpeedFast;

public class CarrosEconomicos extends Carros{
    private String economia;

    public CarrosEconomicos(String modelo, String marca, String economia) {
        super(modelo, marca);
        this.economia = economia;
    }

    public String getEconomia() {
        return economia;
    }

    public void setEconomia(String economia) {
        this.economia = economia;
    }

    @Override
    public void mostrarCarros(){
        System.out.println("\t===== Locadora Speed Fast=====\n");
        System.out.println("===== Carros econômicos =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca :"+marca);
        System.out.println("Economia: "+economia);
    }
}
