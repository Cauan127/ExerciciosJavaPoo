package EscolaFuturoBrilhante;

public class CursosTecnicos extends Curso{
    private String especializacao;

    public CursosTecnicos(String nome, String duracao, String especializacao) {
        super(nome, duracao);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void tiposDeCursos(){
        System.out.println("===== Curso Técnico =====\n");
        System.out.println("Nome: "+getNome());
        System.out.println("Duração: "+getDuracao());
        System.out.println("Especialização: "+getEspecializacao());
    }
}
