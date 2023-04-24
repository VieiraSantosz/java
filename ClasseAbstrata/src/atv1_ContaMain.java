import javax.swing.JOptionPane;

public class atv1_ContaMain {
    public static void main(String[] args) {

        String opcao;
        String senha;
        int opc;
        int sen;


        opcao = JOptionPane.showInputDialog(null, "Conta Bancária Criada com Sucesso! " +
                "\n\nDigite a opção da sua conta: \n1 - Conta Corrente \n2 - Conta Poupança");
        opc = Integer.parseInt( opcao );

        switch (opc)
        {
            case 1:
                String numero, saldo, trasancoes, saque, deposito;
                int num, sal, tran, saq, dep;
                opc = 0;

                atv1_ContaCorrente corrente = new atv1_ContaCorrente();

                senha = JOptionPane.showInputDialog(null,"Digite uma senha para a sua Conta.");
                sen = Integer.parseInt( senha );
                corrente.setSenha(sen);

                opcao = JOptionPane.showInputDialog(null,"Senha criada com sucesso! " +
                        "\n 1 - Para continuar. \n 2 - Alterar Senha.");
                opc = Integer.parseInt( opcao );
                if (opc == 2) {
                    corrente.alterarSenha();
                } else {

                }

                numero = JOptionPane.showInputDialog(null,"Conta Corrente criada! " +
                        "\nDigite o número da Conta:");
                num = Integer.parseInt( numero );

                saldo = JOptionPane.showInputDialog(null, "Digite o saldo da Conta:");
                sal = Integer.parseInt( saldo );
                corrente.setSaldo(sal);

                trasancoes = JOptionPane.showInputDialog(null,"Digite a quantidade de Transações da Conta:");
                tran = Integer.parseInt( trasancoes );

                saque = JOptionPane.showInputDialog(null,"Digite a quantidade de dinheiro que desesa sacar:");
                saq = Integer.parseInt( saque );
                corrente.sacar(saq);

                deposito = JOptionPane.showInputDialog(null,"Digite a quantidade de dinheiro que desesa depositar:");
                dep = Integer.parseInt( deposito );
                corrente.depositar(dep);

                JOptionPane.showMessageDialog(null, "Número da Conta - " + num +
                        "\nSaldo da Conta - " + sal + "\nQuantidade de Transações - " + tran);

                corrente.tirarExtatro();
            break;

            case 2:
                String redndimento;
                int ren;

                atv1_ContaPopanca bancaria = new atv1_ContaPopanca();

                numero = JOptionPane.showInputDialog(null,"Conta Poupança criada! " +
                        "\nDigite o número da Conta:");
                num = Integer.parseInt( numero );

                saldo = JOptionPane.showInputDialog(null, "Digite o saldo da Conta:");
                sal = Integer.parseInt( saldo );
                bancaria.setSaldo(sal);

                redndimento = JOptionPane.showInputDialog(null,"Digite a da taxa de Rendimento:");
                ren = Integer.parseInt( redndimento );

                saque = JOptionPane.showInputDialog(null,"Digite a quantidade de dinheiro que desesa sacar:");
                saq = Integer.parseInt( saque );
                bancaria.sacar(saq);

                deposito = JOptionPane.showInputDialog(null,"Digite a quantidade de dinheiro que desesa depositar:");
                dep = Integer.parseInt( deposito );
                bancaria.depositar(dep);

                JOptionPane.showMessageDialog(null, "Número da Conta - " + num +
                        "\nSaldo da Conta - " + sal + "\nTaxa de Rendimento - " + ren);
                bancaria.tirarExtatro();
            break;
        }
    }
}