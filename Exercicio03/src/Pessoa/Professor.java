package Pessoa;

public class Professor extends Pessoas{
    private double salario;
    private String disciplina;
    private String areaDeAtuacao;

    public Professor(String nome, int idade, String cpf, String endereco, double salario, String disciplina, String areaDeAtuacao){
        super(nome, idade, cpf, endereco);
        this.salario = salario;
        this.disciplina = disciplina;
        this.areaDeAtuacao = areaDeAtuacao;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
}
