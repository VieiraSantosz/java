import javax.swing.JOptionPane;

public class atv7_1Parcelas {
    public static void main(String[] args) {

        String vista, parcela, resposta, compra;
        int vis, par, res, com;
        double novo_vis, novo, valor;

        resposta = JOptionPane.showInputDialog("1 - Pagamento à Vista \n2- Pagamento Parcelado \n\nDigite sua Opção:");
        res = Integer.parseInt( resposta );

        switch (res) {
            case 1:
                vista = JOptionPane.showInputDialog("Digite o valor do carro:");
                vis = Integer.parseInt( vista );

                novo_vis = vis * 0.80;
                JOptionPane.showMessageDialog(null, "Valor com os 20% de desconto - " +novo_vis);
            break;
            case 2:
                compra = JOptionPane.showInputDialog( "Digite o valor do carro:" );
                com = Integer.parseInt( compra );
                parcela = JOptionPane.showInputDialog( "6 - Parcelas \n12 - Parcelas \n18 - Parcelas \n24 - Parcelas" +
                        "\n30 - Parcelas \n36 - Parcelas \n42 - Parcelas \n48 - Parcelas \n54 - Parcelas" +
                        "\n60 - Parcelas \n\nDigite o Valor das Quantidades de Parcelas: " );
                par = Integer.parseInt( parcela );

                switch (par) {
                    case 6:
                        novo = (com/6) * 1.03;
                        valor = novo * 6;
                        JOptionPane.showMessageDialog(null, "Juros de 3% \nValor da Compra - " +valor);
                    break;

                    case 12:
                        novo = (com/12) * 1.06;
                        valor = novo * 12;
                        JOptionPane.showMessageDialog(null, "Juros de 6% \nValor da Compra - " +valor);
                    break;

                    case 18:
                        novo = (com/18) * 1.09;
                        valor = novo * 18;
                        JOptionPane.showMessageDialog(null, "Juros de 9% \nValor da Compra - " +valor);
                   break;

                    case 24:
                        novo = (com/24) * 1.12;
                        valor = novo * 24;
                        JOptionPane.showMessageDialog(null, "Juros de 12% \nValor da Compra - " +valor);
                   break;

                    case 30:
                        novo = (com/30) * 1.15;
                        valor = novo * 30;
                        JOptionPane.showMessageDialog(null, "Juros de 15% \nValor da Compra - " +valor);
                   break;

                    case 36:
                        novo = (com/36) * 1.18;
                        valor = novo * 36;
                        JOptionPane.showMessageDialog(null, "Juros de 18% \nValor da Compra - " +valor);
                   break;

                    case 42:
                        novo = (com/42) * 1.21;
                        valor = novo * 42;
                        JOptionPane.showMessageDialog(null, "Juros de 21% \nValor da Compra - " +valor);
                    break;

                    case 48:
                        novo = (com/48) * 1.24;
                        valor = novo * 48;
                        JOptionPane.showMessageDialog(null, "Juros de 24% \nValor da Compra - " +valor);
                   break;

                    case 54:
                        novo = (com/54) * 1.27;
                        valor = novo * 54;
                        JOptionPane.showMessageDialog(null, "Juros de 27% \nValor da Compra - " +valor);
                   break;

                    case 60:
                        novo = (com/60) * 1.30;
                        valor = novo * 60;
                        JOptionPane.showMessageDialog(null, "Juros de 30% \nValor da Compra - " +valor);
                   break;
                }
            break;
        }

    }
}
