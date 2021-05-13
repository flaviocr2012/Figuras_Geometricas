package figuras;

public class Figura {

    private int raio = 9;
    private double pi = 3.14;
    private int base = 17;
    private int b = 8;
    private int a = 2;

    public Figura(int raio, double pi, int base, int b, int a) {
        this.raio = raio;
        this.pi = pi;
        this.base = base;
        this.b = b;
        this.a = a;
    }

    public Figura() {

    }

    public double calculaAreaCirculo(int raio, double pi) {
        return raio * pi;
    }

    public double CalculaAreaQuadrado(int base, int altura) {
        return base * altura;
    }

    public double CalculaAreaRetangulao(int b, int a) {
        return b * a;
    }

    public double CalculaAreaTriangulo(int b, int a) {
        return (b * a) / 2;

    }

}