public class atv3_Funcionario {
    public static void main(String[] args) {

        double salario = 1000;
        double porcento = 1.5, nova_por;
        double novoSalario;

        for (int i = 1996; i < 2023; i++) {

            nova_por = (100 + porcento) / 100;
            novoSalario = salario * nova_por;

            System.out.printf("Ano - %d || Salário - %.2f\n", i, novoSalario);
            porcento = porcento * 2;
        }
    }
}
