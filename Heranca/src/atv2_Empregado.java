public class atv2_Empregado extends atv2_Pessoas {
    private double salario;
    private String matricula;

    public atv2_Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

}
