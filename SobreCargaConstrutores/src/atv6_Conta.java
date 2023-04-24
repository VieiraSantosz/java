public class atv6_Conta {

    private int agencia;
    private int conta;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    public atv6_Conta() {
        this.agencia = 0;
        this.conta = 0;
    }

    public atv6_Conta(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public String imprimirEstado () {
        if (this.conta < 100)
            return "Conta Negativa";
        else
            return "Conta Positiva";
    }

    public static void main(String[] args) {

        atv6_Conta b1 = new atv6_Conta();
        System.out.println(b1.getAgencia());
        System.out.println(b1.getConta());
        System.out.println(b1.imprimirEstado());
        System.out.println();

        atv6_Conta b2 = new atv6_Conta(200, 110);
        System.out.println(b2.getAgencia());
        System.out.println(b2.getConta());
        System.out.println(b2.imprimirEstado());
    }
}
