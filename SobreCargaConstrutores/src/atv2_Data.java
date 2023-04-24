public class atv2_Data {

    private int dia;
    private int mes;
    private int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Object getDia() {
        if (this.dia > 31)
            return null;
        else
            return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Object getMes() {
        if (this.mes > 12)
            return null;
        else
            return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Object getAno() {
        if (this.ano < 0)
            return null;
        else
            return ano;
    }

    public atv2_Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static void main(String[] args) {

        atv2_Data m1 = new atv2_Data(32, 13, -1);

        System.out.printf("\n%d / %d / %d\n", m1.getDia(), m1.getMes(), m1.getAno());
    }
}
