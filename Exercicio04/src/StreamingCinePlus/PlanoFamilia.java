package StreamingCinePlus;

public class PlanoFamilia extends Assinaturas{
    private String usuarios;

    public PlanoFamilia(String qualidade, String usuarios) {
        super(qualidade);
        this.usuarios = usuarios;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public void exibirAssinatura(){
        System.out.println("\n===== Família =====\n");
        System.out.println("Filmes e séries");
        System.out.println("Qualidade: "+qualidade);
        System.out.println("Usuários: "+usuarios);
    }
}
