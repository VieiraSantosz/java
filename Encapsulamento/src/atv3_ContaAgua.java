public class atv3_ContaAgua {

    private int numero;
    private int mes;
    private int ano;
    private float m3;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }

    public float getM3() {
        return m3;
    }

    public void imprimiDados() {
        System.out.printf("\nNúmero da Conta - %d", getNumero());
        System.out.printf("\nMês - %d", getMes());
        System.out.printf("\nAno - %d", getAno());
    }

    public float calculaValor () {
        double conta;
        conta = m3 * 13.64;

        return (float) conta;
    }

    public static void main(String[] args) {

        atv3_ContaAgua c1 = new atv3_ContaAgua();
        c1.setNumero(567);
        c1.setMes(5);
        c1.setAno(2022);

        c1.imprimiDados();

        c1.setM3(100);
        c1.calculaValor();
        System.out.printf("\nValor da Conta de Água - R$%.2f\n", c1.calculaValor());
    }
}
