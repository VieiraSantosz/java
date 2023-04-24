import java.util.Scanner;

public class atv3_CompraMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        atv3_Compra c1 = new atv3_Compra();

        System.out.println("Digite o valor do Produto - ");
        int valor = ler.nextInt();
        c1.setValor(valor);

        System.out.println("Digite a quantidade de Parcelas - ");
        int parcelas = ler.nextInt();
        c1.setParcelas(parcelas);

        c1.tabelaJuros();
    }
}
