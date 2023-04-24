public class atv2_Pessoa {
    private int idade;
    private int peso;

    public atv2_Pessoa() {

    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void grupoRisco() {
        if (this.peso <= 60) {
            if (this.idade < 20) {
                System.out.println("Grupo de Risco - 9");
            } else if (this.idade >= 20 && this.idade <= 50) {
                System.out.println("Grupo de Risco - 6");
            } else {
                System.out.println("Grupo de Risco - 3");
            }
        } else if (this.peso > 90) {
            if (this.idade < 20) {
                System.out.println("Grupo de Risco - 7");
            } else if (this.idade >= 20 && this.idade <= 50) {
                System.out.println("Grupo de Risco - 4");
            } else {
                System.out.println("Grupo de Risco - 1");
            }
        } else {
            if (this.idade < 20) {
                System.out.println("Grupo de Risco - 8");
            } else if (this.idade >= 20 && this.idade <= 50) {
                System.out.println("Grupo de Risco - 5");
            } else {
                System.out.println("Grupo de Risco - 2");
            }
        }
    }
}
