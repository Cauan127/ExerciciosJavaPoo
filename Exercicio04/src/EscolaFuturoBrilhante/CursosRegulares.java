package EscolaFuturoBrilhante;

public class CursosRegulares extends Curso {

    public CursosRegulares(String nome, String duracao) {
        super(nome, duracao);
    }

    @Override
    public void tiposDeCursos(){
        System.out.println("Cursos:\n");
        System.out.println("===== Curso regular =====\n");
        System.out.println("Nome: "+getNome());
        System.out.println("Duração: "+getDuracao());
    }
}
