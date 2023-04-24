import java.util.Scanner;

public class atv3_TemperaturaMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Coloque o valor da Temperatura em Celsius (°C) - ");
        int C = ler.nextInt();

        atv3_Temperatura Celsius = new atv3_Temperatura(C);

        Celsius.Fahrenheit();
        Celsius.Kelvin();
    }
}
