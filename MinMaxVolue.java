import java.util.Scanner;

public class MinMaxVolue {
    public static void main(String[] args) {
        int a, b;
        int min =0,max = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı girmek istiyorsunuz: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("Bir sayı giriniz: ");
            b = input.nextInt();

            if (i == 1) {
                min = b;
                max = b;
            }

                if (b < min) {
                    min = b;
                }
                if (b > max) {
                    max = b;
                }


        }
        System.out.println("Sayıların en küçüğü: " + min);
        System.out.println("Sayıların en büyüğü: " + max);

    }
}
