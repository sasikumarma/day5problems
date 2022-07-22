import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
          System.out.println("Enter a number");
          num=obj.nextInt();
        if(num%2==0)
            System.out.println("Num is even");
        else
            System.out.println("Num is odd");
    }
}
