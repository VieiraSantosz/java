public class atv1_Data {

    public int dia;
    public int mes;
    public int ano;

    public void entraDados (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimiData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public static void main(String[] args) {

        atv1_Data d1 = new atv1_Data();

        d1.entraDados(02, 05, 2002);
        d1.imprimiData();
    }
}
