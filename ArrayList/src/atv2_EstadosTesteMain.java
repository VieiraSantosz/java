import java.util.ArrayList;
import java.util.Scanner;

public class atv2_EstadosTesteMain {
    public static void main(String[] args) {

        int opc;
        String nomeEstado;
        String siglaEstado;

        Scanner ler = new Scanner(System.in);
        Scanner lerNome = new Scanner(System.in);

        ArrayList<atv2_Estados> infoEstado = new ArrayList();

        do {

            System.out.println("\n1 - Cadastrar Estados" +
                    "\n2 - Pesquisar Estado" +
                    "\n3 - Pesquisar Sigla do Estado" +
                    "\n4 - Excluir Estado" +
                    "\n5 - Limpar Cadastro dos Estados" +
                    "\n6 - Exibir lista do Vetor" +
                    "\n7 - Sair do Programa" +
                    "\nEsolha sua opção:");
            opc = ler.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\nDigite o Nome do Estado:");
                    nomeEstado = lerNome.nextLine();

                    System.out.println("\nDigite a Sigla do Estado:");
                    siglaEstado = lerNome.nextLine();

                    infoEstado.add(new atv2_Estados(nomeEstado, siglaEstado));
                    break;

                case 2:
                    System.out.println("\nDigite o Nome do Estado:");
                    nomeEstado = lerNome.nextLine();

                    boolean status1 = false;

                    for (int i = 0; i < infoEstado.size(); i++) {
                        if (infoEstado.get(i).getNomeEstado().equals(nomeEstado)) {
                            System.out.println("\nEstado Cadastrado - " + infoEstado.get(i).getNomeEstado());
                            status1 = true;
                        }
                    }

                    if (status1 == false) {
                        System.out.println("\nEstado ainda não Cadastrado - " + nomeEstado);
                    }
                    break;

                case 3:
                    System.out.println("\nDigite a Sigla do Estado:");
                    siglaEstado = lerNome.nextLine();

                    boolean status2 = false;

                    for (int i = 0; i < infoEstado.size(); i++) {
                        if (infoEstado.get(i).getSiglaEstado().equals(siglaEstado)) {
                            System.out.println("\nSigla Cadastrada - " + infoEstado.get(i).getSiglaEstado());
                            status2 = true;
                        }
                    }

                    if (status2 == false) {
                        System.out.println("\nSigla ainda não Cadastrada - " + siglaEstado);
                    }
                    break;

                case 4:
                    System.out.println("\nDigite do Estado que deseja remover:");
                    String apagaEstado = lerNome.nextLine();

                    boolean status3 = false;

                    for (int i = 0; i < infoEstado.size(); i++) {
                        if (infoEstado.get(i).getNomeEstado().equals(apagaEstado)) {
                            System.out.println("\n" + apagaEstado + " - Removido com Sucesso!");
                            System.out.println("\n" + infoEstado.get(i).getSiglaEstado() + " - Removido com Sucesso!");
                            infoEstado.remove(i);
                            status3 = true;
                        }
                    }

                    if (status3 == false) {
                        System.out.println("\nEstado não Encontrado - " + apagaEstado);
                    }
                    break;

                case 5:
                    infoEstado.clear();
                    System.out.println("\nVetores limpados com sucesso!");
                    break;

                case 6:
                    System.out.println("\nTamanho do Vetor dos Estados - " + infoEstado.size());

                    for (int i = 0; i < infoEstado.size(); i++) {
                        System.out.println("" + infoEstado.get(i).getSiglaEstado() + " - " + infoEstado.get(i).getNomeEstado());
                    }
                    break;

                case 7:
                    System.out.println("\nObrigado por usar o Programa!");
                    break;

                default:
                    System.out.println("\nOpção Inválida, tente novamente!");
            }

        } while (opc != 7);
    }
}
