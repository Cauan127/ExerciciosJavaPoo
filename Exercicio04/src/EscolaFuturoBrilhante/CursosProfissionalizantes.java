package EscolaFuturoBrilhante;

public class CursosProfissionalizantes extends Curso{

    public CursosProfissionalizantes(String nome, String duracao) {
        super(nome, duracao);
    }

    @Override
    public void tiposDeCursos(){
        System.out.println("\n===== Curso regular =====\n");
        System.out.println("Nome: "+getNome());
        System.out.println("Duração: "+getDuracao());
    }
}
