package Pessoa;

public class Aluno extends Pessoas{
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, String endereco, String matricula, String curso){
        super(nome, idade, cpf, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
