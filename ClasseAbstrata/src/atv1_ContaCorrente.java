import javax.swing.*;

public class atv1_ContaCorrente extends atv1_ContaBancaria {
    private int numero;
    private double saldo;
    private double novoSaldo1, novoSaldo2;
    private double saque, deposito;
    private double quantTransacoesRealizadas;


    public atv1_ContaCorrente() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getQuantTransacoesRealizadas() {
        return quantTransacoesRealizadas;
    }

    public void setQuantTransacoesRealizadas(double quantTransacoesRealizadas) {
        this.quantTransacoesRealizadas = quantTransacoesRealizadas;
    }

    @Override
    public void sacar(double saque) {
        this.saque = saque;
        novoSaldo1 = this.saldo - saque;
    }

    @Override
    public void depositar(double depostio) {
        this.deposito = depostio;
        novoSaldo2 = novoSaldo1 + depostio;
    }

    @Override
    public void tirarExtatro() {
        JOptionPane.showMessageDialog(null, "Saque \nValor sacado - " + saque +
        "\nSaldo atual - " + novoSaldo1 + "\n\nDepósito \nValor depositado - " + deposito +
                        "\nSaldo atual - " + novoSaldo2);
    }
}
