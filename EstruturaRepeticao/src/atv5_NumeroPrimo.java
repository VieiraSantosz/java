import javax.swing.JOptionPane;

public class atv5_NumeroPrimo {
    public static void main(String[] args) {

        for (int i = 100;i < 150; i++) {
            if ( i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {

            } else {
                JOptionPane.showMessageDialog(null, "Número Primo - " +i);
            }
        }

    }
}
