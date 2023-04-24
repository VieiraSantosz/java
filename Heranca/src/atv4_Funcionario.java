public class atv4_Funcionario extends atv4_Nome {
    private int matricula;
    private double salario;

    public atv4_Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super (nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        if (salario < 0) {
            return 0;
        } else {
            return salario;
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrimeiraParcela() {
        double primeiroSalario;

        primeiroSalario = salario * 0.60;
        return primeiroSalario;
    }

    public double getSegundaParcela() {
        double segundoSalario;

        segundoSalario = salario * 0.40;
        return segundoSalario;
    }

}
