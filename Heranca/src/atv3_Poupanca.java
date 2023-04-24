public class atv3_Poupanca extends atv3_Conta {
    private int diaRendimento;

    public atv3_Poupanca(double saldo, int diaRendimento) {
        super(saldo);
        this.diaRendimento = diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

}
