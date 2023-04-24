public class atv2_Retangulo extends atv2_Forma {
    private float lado;
    private  float altura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        float area;

        area = this.altura * this.lado;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        float perimetro;

        perimetro = (2 * this.lado) + (2 * this.altura);
        return perimetro;
    }
}