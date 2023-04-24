import java.util.Scanner;

public class atv2_FormaMain {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int lado;
        int altura;
        int raio;

        atv2_Retangulo retangulo = new atv2_Retangulo();
        System.out.println("Digite o lado do Retângulo (cm):");
        lado = ler.nextInt();
        retangulo.setLado(lado);

        System.out.println("Digite a altura do Retângulo (cm):");
        altura = ler.nextInt();
        retangulo.setAltura(altura);

        System.out.printf("\nLado do Retângulo....... %.0f cm", retangulo.getLado());
        System.out.printf("\nAltura do Retângulo..... %.0f cm", retangulo.getAltura());
        System.out.printf("\nPerímetro do Retângulo.. %.0f cm", retangulo.calcularPerimetro());
        System.out.printf("\nÁrea do Retângulo....... %.2f cm²", retangulo.calcularArea());


        atv2_Circulo circulo = new atv2_Circulo();
        System.out.println("\n\nDigite o Raio do Círculo (cm):");
        raio = ler.nextInt();
        circulo.setRaio(raio);

        System.out.printf("\nRaio do Círculo....... %.0f cm", circulo.getRaio());
        System.out.printf("\nPerímetro do Círculo.. %.0f cm", circulo.calcularPerimetro());
        System.out.printf("\nÁrea do Círculo....... %.2f cm²", circulo.calcularArea());
    }
}
