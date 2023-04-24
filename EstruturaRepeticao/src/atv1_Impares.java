public class atv1_Impares {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i < 501; i++) {

            if (i % 2 == 1 && i % 3 == 0) {

                System.out.println(" " + i);
                soma = soma + i;
            }
        }

        System.out.println("Soma - " + soma);
    }
}
