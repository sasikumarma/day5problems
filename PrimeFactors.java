
import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i);
                num = num / i;
                i = 1;

            }
        }
    }
}