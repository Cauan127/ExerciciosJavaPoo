package FormasGeometricas;

public class Retangulo{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularAreaRetangulo() {
        return largura * altura;
    }

    public double calcularPerimetroRetangulo() {
        return 2 * (largura + altura);
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}
