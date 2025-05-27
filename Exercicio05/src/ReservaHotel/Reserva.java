package ReservaHotel;

public class Reserva {
    private String hospede;
    private int quarto;
    private String entrada;
    private String saida;

    public Reserva(String hospede, int quarto, String entrada, String saida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.entrada = entrada;
        this.saida = saida;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
}