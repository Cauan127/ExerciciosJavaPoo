package Banco;

public class Conta {
    private String nomeTitular;
    private double saldo;
    private String cpf;

    public Conta(String nomeTitular, double saldo, String cpf) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}