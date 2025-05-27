package FormasGeometricas;

public class Triangulo{
    private double largura;
    private double altura;
    private double lado;

    public Triangulo(double largura, double altura, double lado) {
        this.largura = largura;
        this.altura = altura;
        this.lado = lado;
    }

    public double calcularAreaTriangulo(){
        return (largura*altura) / 2;
    }

    public double calcularPerimetroTriangulo(){
        return lado+lado+lado;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}