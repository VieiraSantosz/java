public class atv2_PessoasMain {
    public static void main(String[] args) {

        atv2_Cliente cli = new atv2_Cliente("Vieira", 20, "Masculino", 2000,
                                    "02/05/2002");
        System.out.println("Cliente:");
        System.out.println(cli.getNome());
        System.out.println(cli.getIdade());
        System.out.println(cli.getSexo());
        System.out.println(cli.getValorDivida());
        System.out.println(cli.getAnoNasc());

        atv2_Gerente ger = new atv2_Gerente("Santos", 35, "Masculino", 4500,
                                "SP3809", "Banco Itau", 320);
        System.out.println();
        System.out.println("Vendedor:");
        System.out.println(ger.getNome());
        System.out.println(ger.getIdade());
        System.out.println(ger.getSexo());
        System.out.println(ger.getSalario());
        System.out.println(ger.getMatricula());
        System.out.println(ger.getNomeGerente());
        System.out.println(ger.getInss());

        atv2_Vendedor ven = new atv2_Vendedor("Richarlisson", 25, "Masculino", 2200,
                "BR04", 450, 30);
        System.out.println();
        System.out.println("Vendedor:");
        System.out.println(ven.getNome());
        System.out.println(ven.getIdade());
        System.out.println(ven.getSexo());
        System.out.println(ven.getSalario());
        System.out.println(ven.getMatricula());
        System.out.println(ven.getValorVendar());
        System.out.println(ven.getQntVendas());

    }
}
