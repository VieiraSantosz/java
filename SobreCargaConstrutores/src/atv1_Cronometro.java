public class atv1_Cronometro {

    private int hora;
    private int minuto;
    private int segundo;

    public atv1_Cronometro() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public atv1_Cronometro(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 1;
    }

    public atv1_Cronometro(int hora) {
        this.hora = hora;
        this.minuto = 1;
        this.segundo = 1;
    }

    public atv1_Cronometro(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public static void main(String[] args) {

        atv1_Cronometro c1 = new atv1_Cronometro();

        System.out.printf("\nHora.... - %d", c1.hora);
        System.out.printf("\nMinutos. - %d", c1.minuto);
        System.out.printf("\nSegundos - %d\n", c1.segundo);
    }
}
