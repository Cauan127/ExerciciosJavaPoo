package AgenciaDeViagens;

public class PacoteEconomico extends Pacote{

    public PacoteEconomico(String hospedagem) {
        super(hospedagem);
    }

    @Override
    public void exibirPacotes(){
        System.out.println("\t===== Pacotes de viagens =====\n");
        System.out.println("===== Econômico =====\n");
        System.out.println("Somente hospedagem no "+hospedagem);
    }
}
