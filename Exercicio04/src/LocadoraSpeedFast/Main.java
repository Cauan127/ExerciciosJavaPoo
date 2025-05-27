package LocadoraSpeedFast;

public class Main{
    public static void main(String[] args){

        CarrosEconomicos economico = new CarrosEconomicos("Uno","Fiat","70%");
        CarrosSUVs suvs = new CarrosSUVs("Hillux","Chevrolet","Alta");
        CarrosPremium exclusivo = new CarrosPremium("BMW","TORO","Direção automática");

        economico.mostrarCarros();
        suvs.mostrarCarros();
        exclusivo.mostrarCarros();
    }
}
