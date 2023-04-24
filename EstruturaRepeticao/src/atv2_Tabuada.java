import java.util.Scanner;

 class atv2_Tabuada {
     public static void main(String[] args) {

         int resultado, n1;

         Scanner ler = new Scanner(System.in);

         System.out.println("Digite um número:");
         n1 = ler.nextInt();

         for (int i = 1; i < 11; i++) {
             resultado = n1 * i;
             System.out.printf("%d * %d = %d\n", n1, i, resultado);
         }
     }
}
