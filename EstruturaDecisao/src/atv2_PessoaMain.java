import java.util.Scanner;

public class atv2_PessoaMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu Peso (kg) - ");
        int peso = ler.nextInt();

        System.out.println("Digite sua Idade - ");
        int idade = ler.nextInt();

        atv2_Pessoa risco = new atv2_Pessoa();

        risco.setPeso(peso);
        risco.setIdade(idade);

        risco.grupoRisco();
    }
}
