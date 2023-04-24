import java.util.Scanner;

public class atv1_NomesMain {
    public static void main(String[] args) {

        String nome = null;
        int cont;

        Scanner num = new Scanner(System.in);
        Scanner stri = new Scanner(System.in);

        System.out.println("Digite quantos nomes serão digitados:");
        cont = num.nextInt();

        for (int i = 0; i < cont; i++) {
            System.out.printf("%d° nome - " ,i+1);
            nome = stri.nextLine();
        }
    }
}
