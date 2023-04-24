public class atv1_Salario {
    private int salario;

    public atv1_Salario() {

    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void reajustar() {
        double reajuste;

        if (this.salario <= 300) {
            reajuste = this.salario * 1.15;
            System.out.println("Novo Salário - " +reajuste+ "\nAumento de 15%");
        } else if (this.salario > 300 && this.salario <= 600) {
            reajuste = this.salario * 1.10;
            System.out.println("Novo Salário - " +reajuste+ "\nAumento de 10%");
        } else if (this.salario > 600 && this.salario <= 900) {
            reajuste = this.salario * 1.05;
            System.out.println("Novo Salário - " +reajuste+ "\nAumento de 5%");
        } else {
            System.out.println("Não haverá aumento!");
        }
    }
}
