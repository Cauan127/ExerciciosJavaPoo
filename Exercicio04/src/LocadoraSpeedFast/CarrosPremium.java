package LocadoraSpeedFast;

public class CarrosPremium extends Carros{
    private String exclusive;

    public CarrosPremium(String modelo, String marca, String exclusive) {
        super(modelo, marca);
        this.exclusive = exclusive;
    }

    public String getExclusive() {
        return exclusive;
    }

    public void setExclusive(String exclusive) {
        this.exclusive = exclusive;
    }

    @Override
    public void mostrarCarros(){
        System.out.println("\n===== Carros premium =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca :"+marca);
        System.out.println("Exclusividade: "+exclusive);
    }
}
