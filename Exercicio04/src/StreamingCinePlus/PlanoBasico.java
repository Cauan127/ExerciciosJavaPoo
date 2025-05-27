package StreamingCinePlus;

public class PlanoBasico extends Assinaturas{

    public PlanoBasico(String qualidade) {
        super(qualidade);
    }

    @Override
    public void exibirAssinatura(){
        System.out.println("\t===== Assinaturas =====\n");
        System.out.println("===== Padrão =====\n");
        System.out.println("Filmes e séries");
        System.out.println("Qualidade: "+qualidade);
    }
}
