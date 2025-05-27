package ClasseVeiculo;

public class Motocicleta extends Veiculo {
    private int cilindrada;
    private int potencia;

    public Motocicleta(String modelo, String marca, String rodas, int cilindrada, int potencia) {
      super(modelo,marca,rodas);
      this.cilindrada = cilindrada;
      this.potencia = potencia;
    }
}
