public class atv1_VeiculoMain {
    public static void main(String[] args) {

        atv1_Veiculo vei = new atv1_Veiculo("Golf", 2022);
        System.out.println(vei.getChassi());
        System.out.println(vei.getAno());

        atv1_Carro car = new atv1_Carro("La Ferrari", 2020, "Ferrari", 2);
        System.out.println();
        System.out.println(car.getChassi());
        System.out.println(car.getAno());
        System.out.println(car.getMontadora());
        System.out.println(car.getPortas());

    }
}
