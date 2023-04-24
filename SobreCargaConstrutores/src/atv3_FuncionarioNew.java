public class atv3_FuncionarioNew {

    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private int salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public atv3_FuncionarioNew() {
        this.salario = 1500;
    }

    public atv3_FuncionarioNew(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public atv3_FuncionarioNew(int matricula, String nome, int salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }
}
