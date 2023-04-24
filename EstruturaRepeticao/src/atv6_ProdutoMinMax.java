import javax.swing.JOptionPane;

public class atv6_ProdutoMinMax {
    public static void main(String[] args) {

        String preco;
        int pre, i, max = 0, min = 100000;
        int total = 0, media;

        for (i = 1; i < 16; i++) {
            preco = JOptionPane.showInputDialog("Digite o valor do " +i+ "° Produto:");
            pre = Integer.parseInt( preco );

            if (pre > max) {
                max = pre;
            }

            if (pre < min) {
                min = pre;
            }

            total = total + pre;
        }

        media = total / 15;
        JOptionPane.showMessageDialog(null, "Preço Máximo - " +max+ "\nPreço Mínimo - " +min+
                                                                    "\nMédia dos Preços dos Prdoutos - " +media);
    }
}
