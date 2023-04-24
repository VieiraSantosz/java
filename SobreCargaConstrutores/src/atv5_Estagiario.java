public class atv5_Estagiario {

    private int cracha;
    private float salario;
    private String cargo;

    public atv5_Estagiario() {
        setCargo("Assistente");
    }

    public atv5_Estagiario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public int getCracha() {
        return cracha;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public static void main(String[] args) {

        atv5_Estagiario e1 = new atv5_Estagiario();
        System.out.printf("\n%s\n\n", e1.getCargo());

        atv5_Estagiario e2 = new atv5_Estagiario(256, 3200, "Estagiário em Mecânica");
        System.out.println(e2.getCracha());
        System.out.println(e2.getSalario());
        System.out.println(e2.getCargo());
    }
}
