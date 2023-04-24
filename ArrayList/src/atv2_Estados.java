public class atv2_Estados {
    private String nomeEstado;
    private String siglaEstado;

    public atv2_Estados(String nomeEstado, String siglaEstado) {
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
}
