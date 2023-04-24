public class atv1_Veiculo {
    private String chassi;
    private int ano;

    public atv1_Veiculo() {

    }

    public atv1_Veiculo(String chassi, int ano) {
        this.chassi = chassi;
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
