package Evento;

public class Participante{
        private String nome;
        private int idade;
        private String tipoIngresso;

        public Participante(String nome, int idade, String tipoIngresso) {
            this.nome = nome;
            this.idade = idade;
            this.tipoIngresso = tipoIngresso;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}