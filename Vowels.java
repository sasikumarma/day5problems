import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("Enter any alphabet");
        ch=in.next().charAt(0);
        switch (ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("Vowel");
                break;
                default:
                System.out.println("Constant");
        }

    }
}
