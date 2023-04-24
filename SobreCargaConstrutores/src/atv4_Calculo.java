public class atv4_Calculo {

    public int Calculo(int n1, int n2) {
        return n1 + n2;
    }

    public int Calculo(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public double Calculo(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {

        atv4_Calculo c1 = new atv4_Calculo();

        System.out.printf("Soma......... - %d", c1.Calculo(5 ,1));
        System.out.printf("\nMultiplicação - %d", c1.Calculo(2 ,1, 3));
        System.out.printf("\nDivisão...... - %.2f", c1.Calculo(60.0, 10.0));
    }
}
