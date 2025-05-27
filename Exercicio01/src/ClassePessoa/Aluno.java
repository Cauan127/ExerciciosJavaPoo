package ClassePessoa;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, int idade, String matricula, String curso){
        super(nome,cpf,idade);
        this.matricula = matricula;
        this.curso = curso;
    }
}
