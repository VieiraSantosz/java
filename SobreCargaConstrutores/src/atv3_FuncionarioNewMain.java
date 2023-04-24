public class atv3_FuncionarioNewMain {
    public static void main(String[] args) {

        atv3_FuncionarioNew f1 = new atv3_FuncionarioNew();
        System.out.printf("\nSalário - %d\n", f1.getSalario());

        atv3_FuncionarioNew f2 = new atv3_FuncionarioNew("Vieira", 20);
        System.out.printf("\nNome. - %s", f2.getNome());
        System.out.printf("\nIdade - %s\n", f2.getIdade());

        atv3_FuncionarioNew f3 = new atv3_FuncionarioNew(3507852, "Wesley Vieira", 2500);
        System.out.printf("\nMatrícula. - %d", f3.getMatricula());
        System.out.printf("\nNome...... - %s", f3.getNome());
        System.out.printf("\nSalário... - %d\n", f3.getSalario());
    }
}
