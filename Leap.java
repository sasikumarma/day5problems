import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Enter a year=");
        year=in.nextInt();
        if (((year % 4==0) && (year % 100!=0) || (year % 400==0)))

            System.out.println("Enter year is a leap year");
        else
            System.out.println("Enter year is not a leap year");
        }
    }

