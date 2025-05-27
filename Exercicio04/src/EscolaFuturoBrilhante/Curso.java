package EscolaFuturoBrilhante;

public abstract class Curso {
   private String nome;
   private String duracao;

    public Curso(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public abstract void tiposDeCursos();
}
