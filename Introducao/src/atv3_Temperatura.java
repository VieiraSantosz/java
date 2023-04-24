public class atv3_Temperatura {
    private int Temperatura;

    public atv3_Temperatura(int Temperatuta) {
        this.Temperatura = Temperatuta;
    }

    public atv3_Temperatura() {

    }

    public void setTemperatura(int temperatura) {
        Temperatura = temperatura;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void Fahrenheit() {
        double F;

        F = (9 * Temperatura + 160) / 5;
        System.out.println("Temperatura em Fahrenheit (F°) - " + F);
    }

    public void Kelvin() {
        double K;

        K = Temperatura + 273;
        System.out.println("Temperatura em Kelvin (K) - " + K);
    }
}
