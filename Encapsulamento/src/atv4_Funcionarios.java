public class atv4_Funcionarios {

    private int idade;
    private float salario;
    private String nome;
    private int statusFerias;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setStatusFerias(int statusFerias) {
        this.statusFerias = statusFerias;
    }

    public int getStatusFerias() {
        if (this.statusFerias == 1) {
            System.out.println("Férias. - OK!");
        } else if (this.statusFerias == 2) {
            System.out.println("Férias. - NÃO OK!");
        } else {
            System.out.println("Férias. - COMANDO INVÁLIDO\n");
        }

        return 0;
    }

    void imprimir() {
        System.out.println("\nNome... - " + getNome());
        System.out.println("Idade.. - " + getIdade());
        System.out.println("Salário - " + getSalario());
        System.out.println(getStatusFerias());
    }
}
