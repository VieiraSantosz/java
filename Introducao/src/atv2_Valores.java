public class atv2_Valores {
    private double quat1, quat2, quat3;
    private double valor1, valor2, valor3;

    public double getQuat1() {
        return quat1;
    }

    public void setQuat1(double quat1) {
        this.quat1 = quat1;
    }

    public double getQuat2() {
        return quat2;
    }

    public void setQuat2(double quat2) {
        this.quat2 = quat2;
    }

    public double getQuat3() {
        return quat3;
    }

    public void setQuat3(double quat3) {
        this.quat3 = quat3;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor3(double valor3) {
        this.valor3 = valor3;
    }

    public double getValor3() {
        return valor3;
    }

    public atv2_Valores () {
        System.out.println("Nenhum valor inserido");
    }

    public atv2_Valores (double quat1, double valor1, double quat2, double valor2, double quat3, double valor3) {
        this.quat1 = quat1;
        this.quat2 = quat2;
        this.quat3 = quat3;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public double Calculo() {
        double resultado;

        resultado = (quat1 * valor1) + (quat2 * valor2) + (quat3 * valor3);
        return resultado;
    }

    public void Media () {
        double media;

        media = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média dos Valores - " + media);
    }

    public void Soma () {
        double soma;

        soma = valor1 + valor2 + valor3;
        System.out.println("Soma dos Valores - " + soma);
    }
}
