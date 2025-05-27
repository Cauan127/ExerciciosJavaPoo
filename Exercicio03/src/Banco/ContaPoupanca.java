package Banco;

public class ContaPoupanca extends Conta{
    private double taxaDeRendimento;

    public ContaPoupanca(String nomeTitular, double saldo, String cpf, double taxaDeRendimento) {
        super(nomeTitular, saldo, cpf);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
}
