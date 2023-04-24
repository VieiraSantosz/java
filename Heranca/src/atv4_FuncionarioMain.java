public class atv4_FuncionarioMain {
    public static void main(String[] args) {

        atv4_Nome pes1 = new atv4_Nome("Mario", "Lopes");
        pes1.getNomeCompleto();
        System.out.println();

        atv4_Funcionario pes2 = new atv4_Funcionario("Lucas", "Mendes", 352, 2000);
        pes2.getNomeCompleto();
        System.out.println(pes2.getMatricula());
        System.out.println(pes2.getSalario());
        System.out.println(pes2.getPrimeiraParcela());
        System.out.println(pes2.getSegundaParcela());
        System.out.println();

        atv4_Professor pes3 = new atv4_Professor("Rafael", "Lira", 255, 500);
        pes3.getNomeCompleto();
        System.out.println(pes3.getMatricula());
        System.out.println(pes3.getSalario());
        System.out.println(pes3.getPrimeiraParcela());
        System.out.println(pes3.getSegundaParcela());
    }
}
