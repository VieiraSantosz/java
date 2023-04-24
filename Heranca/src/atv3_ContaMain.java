public class atv3_ContaMain {
    public static void main(String[] args) {

        atv3_Conta con = new atv3_Conta(1000);
        con.depositar(200);
        con.sacar(200);

        atv3_Poupanca pou = new atv3_Poupanca(2000, 30);
        System.out.println();
        pou.depositar(500);
        pou.sacar(1000);
        System.out.print(pou.getDiaRendimento());
    }
}
