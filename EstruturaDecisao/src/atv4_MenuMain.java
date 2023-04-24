import java.util.Scanner;

public class atv4_MenuMain {
    public static void main(String[] args) {

        int opc = 0;

        Scanner ler = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        atv4_Menu m1 = new atv4_Menu();


        do {
            System.out.println("\nEscolha uma das opções" +
                    "\n1 - Nome" +
                    "\n2 - Idade" +
                    "\n3 - Nacionalidade" +
                    "\n4 - Sair");
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite seu Nome -");
                    String nome = name.nextLine();
                    System.out.println("Seja Bem-Vindo Sr(a)." + nome);
                    break;

                case 2:
                    System.out.println("Digite sua Idade -");
                    int idade = ler.nextInt();

                    if (idade > 18) {
                        System.out.println("Maior de 18 anos" +
                                "\nIdade da Pessoa - " + idade);
                    } else {
                        System.out.println("Menor de 18 anos" +
                                "\nIdade da Pessoa - " + idade);
                    }
                    break;

                case 3:
                    System.out.println("Digite sua Nacionalidade - ");
                    String nacionalidade = name.nextLine();

                    if (nacionalidade.equals("brasileiro") || nacionalidade.equals("Brasileiro")) {
                        System.out.println("Parabéns por ser Brasiliero!");
                    } else {
                        System.out.println("Apenas Brasileiro são aceitos");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por usar nosso Programa!");
                    break;

                default:
                    System.out.println("Opção Inválida!");

            }
        } while (opc != 4);
    }
}

