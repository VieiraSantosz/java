public class atv1_Carro extends atv1_Veiculo {
    private String montadora;
    private int portas;

    public atv1_Carro() {

    }

    public atv1_Carro(String chassi, int ano, String montadora, int portas) {
        super (chassi, ano);
        this.montadora = montadora;
        this.portas = portas;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

}
