public class atv4_Nome {
    private String nome;
    private String sobrenome;


    public atv4_Nome() {

    }

    public atv4_Nome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void getNomeCompleto() {
        System.out.println(getNome() + " " + getSobrenome());
    }
}
