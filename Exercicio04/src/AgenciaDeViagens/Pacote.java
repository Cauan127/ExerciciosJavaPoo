package AgenciaDeViagens;

public abstract class Pacote {
    protected String hospedagem;

    public Pacote(String hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(String hospedagem) {
        this.hospedagem = hospedagem;
    }

    public abstract void exibirPacotes();
}
