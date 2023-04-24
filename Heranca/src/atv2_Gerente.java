public class atv2_Gerente extends atv2_Empregado {
    private String nomeGerente;
    private int Inss;

    public atv2_Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerente, int Inss) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerente = nomeGerente;
        this.Inss = Inss;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public int getInss() {
        return Inss;
    }

    public void setInss(int inss) {
        Inss = inss;
    }

}
