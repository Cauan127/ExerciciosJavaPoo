package EscolaFuturoBrilhante;

public class Main {
    public static void main(String [] args){

        CursosRegulares regular = new CursosRegulares("Medicina","4 anos");
        CursosTecnicos tecnico = new CursosTecnicos("Técnico em química", "1 ano","Química");
        CursosProfissionalizantes profissional = new CursosProfissionalizantes("Direito","6 anos");

        regular.tiposDeCursos();
        tecnico.tiposDeCursos();
        profissional.tiposDeCursos();
    }
}
