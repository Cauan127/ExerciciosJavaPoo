package LocadoraSpeedFast;

public class CarrosSUVs extends Carros{
    private String suspensao;

    public CarrosSUVs(String modelo, String marca, String suspensao) {
        super(modelo, marca);
        this.suspensao = suspensao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    @Override
    public void mostrarCarros(){
        System.out.println("\n===== Carros SUVs =====\n");
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca :"+marca);
        System.out.println("Suspensão: "+suspensao);
    }
}
