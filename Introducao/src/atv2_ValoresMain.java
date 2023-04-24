public class atv2_ValoresMain {
    public static void main(String[] args) {

        atv2_Valores atv =  new atv2_Valores(1, 1, 1, 1, 1, 1);

        System.out.println("Resultado - " + atv.Calculo());
        atv.Media();
        atv.Soma();
    }
}
