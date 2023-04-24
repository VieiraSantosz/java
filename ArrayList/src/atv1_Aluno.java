public class atv1_Aluno {
    private String nome;
    private int idade;

    public atv1_Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
