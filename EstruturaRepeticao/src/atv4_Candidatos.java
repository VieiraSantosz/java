import javax.swing.JOptionPane;

public class atv4_Candidatos {
    public static void main(String[] args) {

        String voto;
        int vot, cad1 = 0, cad2 = 0, cad3 = 0, cad4 = 0, nulo = 0, branco = 0, total;
        int por1, por2, por3, por4, por_nulo, por_branco;

        do {

            voto = JOptionPane.showInputDialog("Digite seu voto:");
            vot = Integer.parseInt(voto);

            if (vot == 1) {
                cad1++;
            }
            if (vot == 2) {
                cad2++;
            }
            if (vot == 3) {
                cad3++;
            }
            if (vot == 4) {
                cad4++;
            }
            if (vot == 5) {
                nulo++;
            }
            if (vot == 6) {
                branco++;
            }

            total = cad1 + cad2 + cad3 + cad4 + nulo + branco;

        } while (vot != 0);

        por1 = (100 * cad1) / total;
        por2 = (100 * cad2) / total;
        por3 = (100 * cad3) / total;
        por4 = (100 * cad4) / total;
        por_nulo = (100 * nulo) / total;
        por_branco = (100 * branco) / total;
        JOptionPane.showMessageDialog(null,"Candidato 1 - " +por1+ "%\nCandidato 2 - " +por2+
                                                                "%\nCandidato 3 - " +por3+ "%\nCandidato 4 - " +por4+
                                                                "%\nNulo - " +por_nulo+ "%\nBranco - " +por_branco+
                                                                                    "\n\nTotal de Votos - " +total);

    }
}
