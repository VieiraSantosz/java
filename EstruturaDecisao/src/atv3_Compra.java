public class atv3_Compra {
    private int parcelas;

    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void tabelaJuros() {
        double novoValor;

        if (this.parcelas == 1) {
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser pago - " +valor+ "\nJuros de 0%");

        } else if (this.parcelas >= 2 && this.parcelas <= 4) {
            novoValor = valor * 1.025;
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser pago - " +novoValor+ "\nJuros de 2.5%");

        } else if (this.parcelas >= 5 && this.parcelas <= 9) {
            novoValor = valor * 1.045;
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser pago - " +novoValor+ "\nJuros de 4.5%");

        } else if (this.parcelas >= 10 && this.parcelas <= 17) {
            novoValor = valor * 1.0845;
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser pago - " +novoValor+ "\nJuros de 8.45%");

        } else if (this.parcelas >= 18 && this.parcelas <= 23) {
            novoValor = valor * 1.12;
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser pago - " +novoValor+ "\nJuros de 12%");

        } else {
            novoValor = valor * 1.15;
            System.out.println("Quantidade de Parcelas - " +this.parcelas);
            System.out.println("Valor do Produto - " +valor);
            System.out.println("Valor a ser Pago - " +novoValor+ "\nJuros de 15%");
        }
    }

}
