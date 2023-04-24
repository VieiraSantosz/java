public class atv2_Circulo extends atv2_Forma {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area;

        area =  Math.pow(raio, 2) * Math.PI;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;

        perimetro = 2 * raio * Math.PI;
        return perimetro;
    }
}
