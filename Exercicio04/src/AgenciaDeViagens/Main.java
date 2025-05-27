package AgenciaDeViagens;

public class Main {
    public static void main(String[] args){

    PacoteEconomico economico = new PacoteEconomico("AirBnb");
    PacoteTuristico turistico = new PacoteTuristico("Hotel Lux", "Prai de ipanema");
    PacoteLuxo vip = new PacoteLuxo("Palácio Taguara","Latam");

    economico.exibirPacotes();
    turistico.exibirPacotes();
    vip.exibirPacotes();
    }
}
