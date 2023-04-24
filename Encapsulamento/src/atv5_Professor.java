public class atv5_Professor {

    private String nome;
    private int matricula;
    private int cargaHoraria;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCargaHoraria (int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void imprimir() {
        setNome("Santos Dalbo");
        System.out.println(getNome());

        setMatricula(1500);
        System.out.println(getMatricula());

        setCargaHoraria(300);
        System.out.println("Carga Horária - " + getCargaHoraria());
    }
}
