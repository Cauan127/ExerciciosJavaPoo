package ClasseVeiculo;

public class Carro extends Veiculo {
    private String cor;
    private int ano;

    public Carro(String modelo, String marca, String rodas, String cor, int ano){
        super(modelo,marca,rodas);
        this.cor = cor;
        this.ano = ano;
    }
}
