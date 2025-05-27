package ClassePessoa;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String cpf, int idade, double salario){
        super(nome,cpf,idade,salario);
        this.salario = salario;
    }
}
