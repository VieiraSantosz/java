public class atv4_Professor extends atv4_Funcionario {

    public atv4_Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }

    @Override
    public double getPrimeiraParcela() {
        return getSalario();
    }

    @Override
    public double getSegundaParcela() {
        return 0;
    }
}
