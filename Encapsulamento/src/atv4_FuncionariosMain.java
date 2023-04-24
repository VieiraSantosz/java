import java.util.Scanner;

public class atv4_FuncionariosMain {
    public static void main(String[] args) {

        String nome;
        int idade, ferias;
        float salario;

        Scanner ler = new Scanner(System.in);
        atv4_Funcionarios f1 = new atv4_Funcionarios();

        System.out.printf("\nInforme seu Nome: ");
        nome = ler.nextLine();
        f1.setNome(nome);

        System.out.printf("Informe sua Idade: ");
        idade = ler.nextInt();
        f1.setIdade(idade);

        System.out.printf("Informe seu Salário: ");
        salario = ler.nextFloat();
        f1.setSalario(salario);

        System.out.printf("Informe suas Férias // 1 - OK, 2 - NÃO OK!: ");
        ferias = ler.nextInt();
        f1.setStatusFerias(ferias);

        f1.imprimir();
    }
}
