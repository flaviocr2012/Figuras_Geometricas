package figuras;

public class SomatorioDasAreas {

    public static void main(String[] args) {

        Figura c = new Circulo();
        c.calculaAreaCirculo(9, 3.14);

        Figura q = new Quadrado();
        q.CalculaAreaQuadrado(17, 17);

        Figura r = new Retangulo();
        r.CalculaAreaRetangulao(8, 2);

        Figura t = new Triangulo();
        t.CalculaAreaTriangulo(8, 2);

        System.out.println(c.calculaAreaCirculo(9, 3.14) + q.CalculaAreaQuadrado(17, 17) +
                r.CalculaAreaRetangulao(8, 2) + t.CalculaAreaTriangulo(8, 2));
    }
}
