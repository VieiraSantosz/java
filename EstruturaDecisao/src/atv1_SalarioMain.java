import java.util.Scanner;

public class atv1_SalarioMain {
    public static void main(String[] args) {

        atv1_Salario a1 =  new atv1_Salario();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu salário para o reajuste:");
        int salario = ler.nextInt();

        a1.setSalario(salario);

        a1.reajustar();
    }
}
