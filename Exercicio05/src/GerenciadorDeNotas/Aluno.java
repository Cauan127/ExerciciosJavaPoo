package GerenciadorDeNotas;

public class Aluno{
    private String nome;
    private String matricula;
    private double n1;
    private double n2Prova;
    private double n2Trabalho;
    private double n3;
    private double media;
    private String status;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = 0;
        this.n2Prova = 0;
        this.n2Trabalho = 0;
        this.n3 = -1.0;
        this.media = 0;
        this.status = "Notas não lançadas";
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        this.n1 = n1;
    }

    public double getN2Prova(){
        return n2Prova;
    }
    public void setN2Prova(double n2Prova){
        this.n2Prova = n2Prova;
    }

    public double getN2Trabalho(){
        return n2Trabalho;
    }
    public void setN2Trabalho(double n2Trabalho){
        this.n2Trabalho = n2Trabalho;
    }

    public double getN3(){
        return n3;
    }
    public void setN3(double n3){
        this.n3 = n3;
    }

    public double getMedia(){
        return media;
    }
    public String getStatus(){
        return status;
    }

    public void calcularMedia() {
        double n2 = (n2Prova + n2Trabalho) / 2.0;
        media = (n1 + n2) / 2.0;

        if (media >= 6.0) {
            status = "Aprovado";
        } else if (media >= 4.0) {
            status = "Prova Final";
        } else {
            status = "Reprovado";
        }
    }

    public void calcularNotaFinalComN3() {
        if (n3 >= 0) {
            double mediaFinal = (media + n3) / 2;

            if (mediaFinal >= 5) {
                status = "Aprovado na N3";
            } else {
                status = "Reprovado na N3";
            }
        }
    }

    public String toString() {
        String n3Prova;
        if (n3 >= 0) {
            n3Prova = n3 + "";
        } else {
            n3Prova = "Não lançada";
        }

        return "Nome: " + nome +
                "\nMatrícula: " + matricula +
                "\nN1: " + n1 +
                "\nN2: " + ((n2Prova + n2Trabalho) / 2.0) +
                "\nN3: " + n3Prova +
                "\nMédia: " + String.format("%.2f", media) +
                "\nStatus: " + status + "\n";
    }
}
