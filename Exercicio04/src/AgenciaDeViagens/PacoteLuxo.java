package AgenciaDeViagens;

public class PacoteLuxo extends Pacote{
    private String transporte;

    public PacoteLuxo(String hospedagem, String transporte) {
        super(hospedagem);
        this.transporte = transporte;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    @Override
    public void exibirPacotes(){
        System.out.println("\n===== Luxo =====\n");
        System.out.println("Hospedagem no "+hospedagem);
        System.out.println("Pontos turísticos");
        System.out.println("Serviços de transporte(Translado e Privativo): "+transporte);
    }
}
