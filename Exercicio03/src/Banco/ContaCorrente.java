package Banco;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(String nomeTitular, double saldo, String cpf, double limiteChequeEspecial){
        super(nomeTitular, saldo, cpf);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
