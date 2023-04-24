import javax.swing.JOptionPane;

public class atv7_Parcelas {
    public static void main(String[] args) {

        String valor;
        double val, vista, parcelado, total;
        int parcelas, juros = 0;

        valor = JOptionPane.showInputDialog("Digite o Valor do Carro:");
        val = Float.parseFloat( valor );

        vista = val * 0.8;
        System.out.printf("\nValor á Vista - R$%.2f\n\n", vista);

        for (parcelas = 6; parcelas < 61; parcelas = parcelas + 6)
        {
            juros = juros + 3;

            parcelado = val * juros/100 * parcelas;
            total = val + parcelado;

            System.out.printf("Quantidade de Parcelas - %d || Taxa de Juros - %d%%\n", parcelas, juros);
            System.out.printf("Valor Total com a taxa de juros - R$%.2f\n\n", total);

        }
    }
}
