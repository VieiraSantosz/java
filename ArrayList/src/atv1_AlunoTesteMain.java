import java.util.ArrayList;
import java.util.Scanner;

public class atv1_AlunoTesteMain {
    public static void main(String[] args) {

        int opc = 0;

        Scanner string = new Scanner(System.in);
        Scanner inteiro = new Scanner(System.in);

        ArrayList<atv1_Aluno> infoAluno = new ArrayList();

        do {

            System.out.println("\n1 - Cadastrar Aluno" +
                    "\n2 - Pesquisar por Nome" +
                    "\n3 - Pesquisar por Idade" +
                    "\n4 - Limpar Cadastro" +
                    "\n5 - Sair" +
                    "\nEsolha sua opção:");
            opc = inteiro.nextInt();

            switch (opc)
            {
                case 1:
                    System.out.println("\nDigite o Nome do Aluno:");
                    String nome = string.nextLine();

                    System.out.println("\nDigite a Idade do Aluno:");
                    int idade = inteiro.nextInt();

                    atv1_Aluno a1 = new atv1_Aluno(nome, idade);
                    infoAluno.add(a1);
                    break;

                case 2:
                    System.out.println("\nPesquise o Nome do Aluno:");
                    String pesquisaNome = string.nextLine();

                    boolean statusNome = false;

                    for (int i = 0; i < infoAluno.size(); i++) {
                        if (infoAluno.get(i).getNome().equals(pesquisaNome)) {
                            System.out.println("\nNome Encotrado com Sucesso! - " + pesquisaNome);
                            statusNome = true;
                        }
                    }

                    if (statusNome == false) {
                        System.out.println("\nNenhum Aluno encontrado com esse Nome - " + pesquisaNome);
                    }
                    break;

                case 3:
                    System.out.println("\nPesquise a Idade do Aluno:");
                    int pesquisaIdade = inteiro.nextInt();

                    boolean statusIdade = false;

                    for (int i = 0; i < infoAluno.size(); i++) {
                        if (infoAluno.get(i).getIdade() == pesquisaIdade) {
                            System.out.println("\nIdade - " +pesquisaIdade+ " Nome - " +infoAluno.get(i).getNome());
                            statusIdade = true;
                        }
                    }

                    if (statusIdade == false) {
                        System.out.println("\nNenhum Aluno encontrado com essa Idade - " + pesquisaIdade);
                    }
                    break;

                case 4:
                    System.out.println("\nDigite o Nome que deseja remover:");
                    String remover = string.nextLine();

                    boolean statusLimpar = false;

                    for (int i = 0; i < infoAluno.size(); i++) {
                        if (infoAluno.get(i).getNome().equals(remover)) {
                            infoAluno.remove(i);
                            System.out.println("\n" +remover+ " - Removido com Sucesso!");
                            statusLimpar = true;
                        }
                    }

                    if (statusLimpar == false) {
                        System.out.println("\nEsse Nome não foi encontrado - " +remover);
                    }
                    break;

                case 5:
                    System.out.println("\nObrigado!");
                    break;

                default:
                    System.out.println("\nOpção Inválida, tente novamente!");
            }

        } while (opc != 5);

    }
}
