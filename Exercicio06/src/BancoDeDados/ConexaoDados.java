package BancoDeDados;

public class ConexaoDados{
    private static ConexaoDados istancia;

    private ConexaoDados(){
        System.out.println("Conectado ao banco!");
    }

    public static ConexaoDados getIstancia(){
        if(istancia == null){
            istancia = new ConexaoDados();
        }
        return istancia;
    }

    public void conectando(){
        System.out.println("Conectando-se ao banco de dados, aguarde...");
    }
}
