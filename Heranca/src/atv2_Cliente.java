public class atv2_Cliente extends atv2_Pessoas {
    private double valorDivida;
    private String anoNasc;

    public atv2_Cliente(String nome, int idade, String sexo, double valorDivida, String anoNasc) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public String getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(String anoNasc) {
        this.anoNasc = anoNasc;
    }

}
