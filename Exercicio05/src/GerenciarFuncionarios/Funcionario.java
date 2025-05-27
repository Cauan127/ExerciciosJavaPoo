package GerenciarFuncionarios;

import java.util.ArrayList;

public class Funcionario{
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void reajusteSalarial(double percento){
        if(percento > 0){
            salario += salario * (percento/100);
        }
    }

    public void mostrarFuncionario(){
        System.out.println("Nome: "+nome+"\nCargo: "+cargo+"\nSalário: "+salario);
    }
}
