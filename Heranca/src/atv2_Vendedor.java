public class atv2_Vendedor extends atv2_Empregado {
    private double valorVendar;
    private int qntVendas;

    public atv2_Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendar, int qntVendas) {
        super (nome, idade, sexo, salario, matricula);
        this.valorVendar = valorVendar;
        this.qntVendas = qntVendas;
    }

    public double getValorVendar() {
        return valorVendar;
    }

    public void setValorVendar(double valorVendar) {
        this.valorVendar = valorVendar;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

}
