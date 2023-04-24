import javax.swing.*;

public abstract class atv1_ContaBancaria {
    private int senha;
    private int novaSenha;

    public atv1_ContaBancaria() {

    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public void alterarSenha() {
        String sen;
        String novaSen;
        int antigaSenha;

        do {
            sen = JOptionPane.showInputDialog(null, "Digite sua Senha Antiga para fazer alteração:");
            antigaSenha  = Integer.parseInt( sen );

            if (this.senha == antigaSenha) {
                novaSen = JOptionPane.showInputDialog(null, "Digite sua nova Senha:");
                novaSenha  = Integer.parseInt( novaSen );
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta, tente novamente!");
            }
        } while (this.senha != antigaSenha);
    }

    public abstract void sacar (double saque); {

    }

    public abstract void depositar (double depostio); {

    }

    public  abstract void tirarExtatro (); {

    }


}
