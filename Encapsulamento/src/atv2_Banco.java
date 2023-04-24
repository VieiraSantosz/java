public class atv2_Banco {

    public String nome;
    public int numero_conta;
    public int saldo;

    public void imprimir () {
        System.out.println("\nNome - " + nome);
        System.out.println("N° da conta - " + numero_conta);
        System.out.println("Saldo da Conta - " + saldo);
    }

    public void sacar (int saque) {
        int novo_saldo;
        novo_saldo = saldo - saque;
        System.out.printf("\nValor Sacado - %d", saque);
        System.out.printf("\nSaldo Anterior - %d", saldo);
        System.out.printf("\nNovo saldo - %d", novo_saldo);
    }

    public void depositar (int valor) {
        int deposito;
        deposito = saldo + valor;
        System.out.printf("\n\nValor Depositado - %d", valor);
        System.out.printf("\nSaldo Anterior - %d", saldo);
        System.out.printf("\nNovo saldo - %d\n", deposito);
    }

    public static void main(String[] args) {

        atv2_Banco c1 = new atv2_Banco();
        c1.nome = "Leonardo Guerra";
        c1.numero_conta = 765;
        c1.saldo = 1000;

        c1.imprimir();

        c1.sacar(200);
        c1.depositar(300);
    }
}
