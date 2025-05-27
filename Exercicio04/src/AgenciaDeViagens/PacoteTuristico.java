package AgenciaDeViagens;

public class PacoteTuristico extends Pacote{
    private String pontosTuristicos;

    public PacoteTuristico(String hospedagem, String pontosTuristicos) {
        super(hospedagem);
        this.pontosTuristicos = pontosTuristicos;
    }

    public String getPontosTuristicos() {
        return pontosTuristicos;
    }

    public void setPontosTuristicos(String pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }

    @Override
    public void exibirPacotes(){
        System.out.println("\n===== Turistico =====\n");
        System.out.println("Hospedagem no "+hospedagem);
        System.out.println("Pontos exclusivos: "+pontosTuristicos);
    }
}
