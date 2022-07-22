import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        System.out.println("Swapping two numbers=");
        x=in.nextInt();
        y=in.nextInt();
        System.out.println("Before swapping:" +x+" "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("after swapping:" +x+" "+y);




    }

}
