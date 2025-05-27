package ManipulacaoTexto;

public class Texto{
    private String conteudo;

    public Texto(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String inverter() {
        String textoInvertido = "";
        for (int i = conteudo.length() - 1; i >= 0; i--) {
            textoInvertido += conteudo.charAt(i);
        }
        return textoInvertido;
    }

    public int contarChar(){
        return conteudo.length();
    }
}
