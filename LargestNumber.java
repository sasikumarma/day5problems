import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number=");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b&&a>c)
            System.out.println("the greater number=" +a);
        if(b>a&&b>c)
        System.out.println("the greater number=" +b);
        if(c>a&&c>b)
        System.out.println("the greater number=" +c);


    }
}
