package SistemaDeAutenticacao;

public class Autenticacao{
    private String senhaCerta = "Abacate123";

    public void pedirAutenticacao(){
        System.out.println("Digite sua senha para continuar!");
    }

    public boolean autenticacaoCorreta(String senhaInserida){
        return senhaInserida.equals(senhaCerta);
    }
}
