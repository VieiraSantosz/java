public class atv3_Conta {
    double saldo;
    double novoSaldo;

    public atv3_Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(int deposito) {

        novoSaldo = saldo + deposito;
        System.out.println("Novo saldo - " + novoSaldo);
    }

    public void sacar(int saque) {

        novoSaldo = novoSaldo - saque;
        System.out.println("Novo saldo - " + novoSaldo);
    }
}
